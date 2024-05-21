package com.saltoapis.auth;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.net.http.HttpRequest.BodyPublishers;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import com.fasterxml.jackson.jr.ob.JSON;

/**
 * SaltoapisClientCredentialsTokenProvider uses the OAuth2 client credentials
 * flow to get a valid access token from the authorization server. The token
 * is stored locally and reused while it's still valid.
 * 
 * When the token expires a new one will automatically be requested.
 */
public class SaltoapisClientCredentialsTokenProvider implements AccessTokenProvider {

    private final String clientId;
    private final String clientSecret;
    private final String[] scopes;
    private final String discoveryHost;

    private String token;
    private long tokenExpirationTime = 0;

    public SaltoapisClientCredentialsTokenProvider(String clientId, String clientSecret, String[] scopes,
            String discoveryHost) {
        if (discoveryHost == null) {
            // default to production
            discoveryHost = "account.saltosystems.com";
        }

        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.scopes = scopes;
        this.discoveryHost = discoveryHost;
    }

    public SaltoapisClientCredentialsTokenProvider(String id, String secret, String[] scopes) {
        this(id, secret, scopes, null);
    }

    @Override
    public String getToken() {
        if (System.currentTimeMillis() > this.tokenExpirationTime) {
            this.refreshToken();
        }
        return this.token;
    }

    private void refreshToken() {
        try {
            // get oidc config
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://" + this.discoveryHost + "/.well-known/openid-configuration"))
                    .build();

            HttpResponse<String> response = HttpClient.newBuilder().build().send(request,
                    HttpResponse.BodyHandlers.ofString());

            JSON json = JSON.builder().build();
            Map<String, Object> jsonResponse = json.mapFrom(response.body());

            String tokenEndpoint = jsonResponse.get("token_endpoint").toString();

            this.requestNewToken(tokenEndpoint);
        } catch (Exception e) {
            throw new AuthException(e);
        }
    }

    private void requestNewToken(String tokenEndpoint) {
        try {
            Map<String, String> params = new HashMap<>();
            params.put("grant_type", "client_credentials");
            params.put("scope", Arrays.asList(this.scopes).stream().collect(Collectors.joining(" ")));
            params.put("client_id", this.clientId);
            params.put("client_secret", this.clientSecret);

            String form = params.entrySet()
                    .stream()
                    .map(e -> e.getKey() + "=" + URLEncoder.encode(e.getValue(), StandardCharsets.UTF_8))
                    .collect(Collectors.joining("&"));

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(tokenEndpoint))
                    .header("Content-Type", "application/x-www-form-urlencoded")
                    .POST(BodyPublishers.ofString(form))
                    .build();

            HttpResponse<String> response = HttpClient.newBuilder().build().send(request,
                    HttpResponse.BodyHandlers.ofString());

            JSON json = JSON.builder().build();
            Map<String, Object> jsonResponse = json.mapFrom(response.body());

            // in case of error response returns status != 200
            if (response.statusCode() != 200) {
                // { "error":"-", "error_description":"-" }
                throw new AuthException(jsonResponse.get("error_description").toString());
            }

            // { "access_token": "-", "expires_in": -, "id_token": "-",
            // "refresh_token": "-", "scope": "-", "token_type": "-" }
            this.token = jsonResponse.get("access_token").toString();

            int expiresIn = Integer.parseInt(jsonResponse.get("expires_in").toString());
            this.tokenExpirationTime = System.currentTimeMillis() + expiresIn * 1000;
        } catch (AuthException e) {
            throw e;
        } catch (Exception e) {
            throw new AuthException(e);
        }
    }
}

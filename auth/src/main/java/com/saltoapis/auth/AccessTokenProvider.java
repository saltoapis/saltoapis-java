package com.saltoapis.auth;

/**
 * Provides a valid access token.
 *
 * The access token should be stored and cached by this class,
 * requesting a new one to the server before previous token expiration.
 */
public interface AccessTokenProvider {

    /**
     * Returns a valid access token.
     * 
     * This call may request a new token or return a cached one.
     * If it fails to retrieve a token it will throw an exception.
     * 
     * Callers should never store the given access token.
     * 
     * @return a valid access token
     * @throws AuthException if authorization failed
     */
    String getToken();
}

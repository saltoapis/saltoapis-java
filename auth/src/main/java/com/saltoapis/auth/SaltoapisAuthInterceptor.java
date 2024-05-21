package com.saltoapis.auth;

import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.ClientCall;
import io.grpc.ClientInterceptor;
import io.grpc.ForwardingClientCall;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;

/**
 * Saltoapis authorization interceptor injects an access token provided by the
 * an {@link AccessTokenProvider} in the gRPC request.
 */
public class SaltoapisAuthInterceptor implements ClientInterceptor {

    private final AccessTokenProvider oauthClient;

    public SaltoapisAuthInterceptor(AccessTokenProvider oauthClient) {
        this.oauthClient = oauthClient;
    }

    public SaltoapisAuthInterceptor(String id, String secret, String[] scopes) {
        this(new SaltoapisClientCredentialsTokenProvider(id, secret, scopes));
    }

    public SaltoapisAuthInterceptor(String id, String secret, String[] scopes, String discoveryhost) {
        this(new SaltoapisClientCredentialsTokenProvider(id, secret, scopes, discoveryhost));
    }

    @Override
    public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(final MethodDescriptor<ReqT, RespT> methodDescriptor,
            final CallOptions callOptions, final Channel channel) {
        return new ForwardingClientCall.SimpleForwardingClientCall<ReqT, RespT>(
                channel.newCall(methodDescriptor, callOptions)) {
            @Override
            public void start(ClientCall.Listener<RespT> responseListener, Metadata headers) {
                headers.put(
                        Metadata.Key.of("Authorization", Metadata.ASCII_STRING_MARSHALLER),
                        "Bearer " + SaltoapisAuthInterceptor.this.oauthClient.getToken());
                super.start(responseListener, headers);
            }
        };
    }
}

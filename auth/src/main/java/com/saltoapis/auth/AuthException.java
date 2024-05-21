package com.saltoapis.auth;

public class AuthException extends RuntimeException {
    public AuthException(String message) {
        super(message);
    }

    public AuthException(Throwable e) {
        super(e);
    }
}

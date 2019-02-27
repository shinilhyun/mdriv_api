package com.enjoybt.common.exception;

import javax.naming.AuthenticationException;

public class KeyAuthorizedException extends RuntimeException {
    public KeyAuthorizedException() {
        super();
    }

    public KeyAuthorizedException(String message) {
        super(message);
    }

    public KeyAuthorizedException(String message, Throwable cause) {
        super(message, cause);
    }

    public KeyAuthorizedException(Throwable cause) {
        super(cause);
    }

    protected KeyAuthorizedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

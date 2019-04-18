package com.enjoybt.common.exception;

public class BadParamException extends Exception {
    public BadParamException() {
        super("파라미터 입력 형식이 잘못 되었습니다.");
    }

    public BadParamException(String message) {
        super(message);
    }

    public BadParamException(String message, Throwable cause) {
        super(message, cause);
    }

    public BadParamException(Throwable cause) {
        super(cause);
    }

    protected BadParamException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

package com.org.auth.utils;

public class Result<T> {
    private Integer errorCode;
    private String message;
    private T data;

    public Result(Integer errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }

    public Result(int errorCode, String message, T data) {
        this.errorCode = errorCode;
        this.message = message;
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

package com.back.standard;

public interface ResultType {
    String getResultCode();

    String getMsg();

    default <T> T getData() {
        return null;
    }
}

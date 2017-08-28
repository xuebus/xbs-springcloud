package com.zhaopin.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by SYJ on 2017/8/25.
 */
public class RdResultModel<T> {
    @JsonProperty("Code")
    private int code;
    @JsonProperty("Message")
    private String message;
    @JsonProperty("Data")
    private T data;
    public void setCode(int code) {
        this.code = code;
    }
    public int getCode() {
        return code;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }

    public void setData(T data) {
        this.data = data;
    }
    public T getData() {
        return data;
    }

}

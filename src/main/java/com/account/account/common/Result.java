package com.account.account.common;

public class Result {
    private String code;//http返回编码
    private String resultCode;//结果编码
    private Object data;//返回结果

    public Result(String code, String resultCode, Object data) {
        this.code = code;
        this.resultCode = resultCode;
        this.data = data;
    }

    public Result() {

    }
}

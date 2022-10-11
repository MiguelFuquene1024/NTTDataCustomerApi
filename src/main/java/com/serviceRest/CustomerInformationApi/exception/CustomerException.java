package com.serviceRest.CustomerInformationApi.exception;

public class CustomerException extends Exception{
    private static final long serialVersionUID = 1L;
    private String code;

    public CustomerException(String message){
        super(message);
    }


    public String getCode() {
        return code;
    }
}

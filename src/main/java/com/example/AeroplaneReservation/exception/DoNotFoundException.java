package com.example.AeroplaneReservation.exception;

public class DoNotFoundException extends RuntimeException{
    private String errorCode;
    private String errorMessage;
    public DoNotFoundException(){

    }
    public DoNotFoundException(String errorCode,String errorMessage){

    }
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}

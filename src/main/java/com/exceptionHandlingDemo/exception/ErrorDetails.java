package com.exceptionHandlingDemo.exception;


import java.time.LocalDate;

public class ErrorDetails {
    /* Created By Vinay-Kumar-HT */
    private LocalDate date;
    private String message;
    private String details;
    private ErrorCodeEnum errorCode;

    public ErrorDetails(LocalDate date, String message, String details, ErrorCodeEnum errorCode) {
        this.date = date;
        this.message = message;
        this.details = details;
        this.errorCode = errorCode;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public ErrorCodeEnum getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(ErrorCodeEnum errorCode) {
        this.errorCode = errorCode;
    }
}

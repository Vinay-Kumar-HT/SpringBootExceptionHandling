package com.exceptionHandlingDemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
    /* Created By Vinay-Kumar-HT */

    public ResourceNotFoundException(String message) {
        super(message);
    }
}

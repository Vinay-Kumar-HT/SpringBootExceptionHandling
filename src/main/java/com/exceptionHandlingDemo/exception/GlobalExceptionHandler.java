package com.exceptionHandlingDemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDate;

@ControllerAdvice
public class GlobalExceptionHandler {
    /* Created By Vinay-Kumar-HT */

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorDetails> handleResourceNotFoundException(ResourceNotFoundException exception, WebRequest request) {
        var errorDetail = new ErrorDetails(
                LocalDate.now(),
                exception.getMessage(),
                request.getDescription(false),
                ErrorCodeEnum.USER_NOT_FOUND);
        return new ResponseEntity<>(errorDetail, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(EmailAlreadyExistsException.class)
    public ResponseEntity<ErrorDetails> handleResourceNotFoundException(EmailAlreadyExistsException exception, WebRequest request) {
        var errorDetail = new ErrorDetails(
                LocalDate.now(),
                exception.getMessage(),
                request.getDescription(false),
                ErrorCodeEnum.EMAIL_ALREADY_EXIST);
        return new ResponseEntity<>(errorDetail, HttpStatus.NOT_FOUND);
    }



}

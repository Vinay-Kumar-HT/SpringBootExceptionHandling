package com.exceptionHandlingDemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    /* Created By Vinay-Kumar-HT */
    private String fieldName;
    private String fieldProperty;
    private String fieldValue;

    public ResourceNotFoundException(String fieldName, String fieldProperty, String fieldValue) {
        super(String.format("%s is not found with %s : '%s'",fieldName,fieldProperty,fieldValue));
        this.fieldName = fieldName;
        this.fieldProperty = fieldProperty;
        this.fieldValue = fieldValue;
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldProperty() {
        return fieldProperty;
    }

    public void setFieldProperty(String fieldProperty) {
        this.fieldProperty = fieldProperty;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }
}

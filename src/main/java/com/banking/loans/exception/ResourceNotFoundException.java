package com.banking.loans.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String resource, String field, String value) {
        super(String.format("%s not found for the %s with %s", resource, field, value ));
    }
}

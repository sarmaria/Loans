package com.banking.loans.dto;

import org.springframework.http.HttpStatusCode;

public record ResponseDto(
    String message,
    HttpStatusCode status){
}

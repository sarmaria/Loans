package com.banking.loans.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = LoansContactInfoDto.PREFIX)
public record LoansContactInfoDto(String message, Map<String, String> contactDetails, List<String> onCallSupport) {
    static final String PREFIX = "loans";
}

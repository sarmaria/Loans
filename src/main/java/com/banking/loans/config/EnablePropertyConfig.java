package com.banking.loans.config;

import com.banking.loans.controller.LoanController;
import com.banking.loans.dto.LoansContactInfoDto;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(LoansContactInfoDto.class)
public class EnablePropertyConfig {
}

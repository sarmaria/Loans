package com.banking.loans.config;


import com.banking.loans.audit.AuditorAwareImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
public class AuditConfig {

    @Bean
    public AuditorAwareImpl auditorProvider(){
        return new AuditorAwareImpl();
    }
}

package com.banking.loans.repository;

import com.banking.loans.entities.Loans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LoansRepository extends JpaRepository<Loans, Long> {
    Optional<Loans> findByMobileNumber(String loanNumber);
    Optional<Loans> findByLoanNumber(String loanNumber);
}

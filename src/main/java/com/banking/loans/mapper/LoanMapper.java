package com.banking.loans.mapper;

import com.banking.loans.dto.LoanDto;
import com.banking.loans.entities.Loans;

public class LoanMapper {
    public static Loans toEntity(Loans loan, LoanDto loanDto) {
        loan.setLoanNumber(loanDto.loanNumber());
        loan.setMobileNumber(loanDto.mobileNumber());
        loan.setLoanType(loanDto.loanType());
        loan.setTotalLoan(loanDto.totalLoan());
        loan.setAmountPaid(loanDto.amountPaid());
        loan.setOutstandingAmount(loanDto.outstandingAmount());
        return loan;
    }

    public static LoanDto toDto(Loans loan) {
        return new LoanDto(loan.getMobileNumber(),
                loan.getLoanNumber(),
                loan.getLoanType(),
                loan.getTotalLoan(),
                loan.getAmountPaid(),
                loan.getOutstandingAmount());
    }
}

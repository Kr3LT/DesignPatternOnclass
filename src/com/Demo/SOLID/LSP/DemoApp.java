package com.Demo.SOLID.LSP;

import java.math.BigDecimal;

public class DemoApp {
    public static void main(String[] args) {
        Account myCurrentAccount = new CurrentAccount();
        myCurrentAccount.deposit(new BigDecimal(1000.00));

        BankingWithdrawalService withdrawalService = new BankingWithdrawalService(myCurrentAccount);
        withdrawalService.withdraw(new BigDecimal(100.00));

//        Account myFixedTermDepositAccount = new FixedTermDepositAccount();
//        myFixedTermDepositAccount.deposit(new BigDecimal(1000.00));
//
//        BankingWithdrawalService withdrawalService = new BankingWithdrawalService(myFixedTermDepositAccount);
//        withdrawalService.withdraw(new BigDecimal(100.00));
    }
}

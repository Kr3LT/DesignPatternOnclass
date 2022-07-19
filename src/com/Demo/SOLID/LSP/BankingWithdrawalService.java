package com.Demo.SOLID.LSP;

import java.math.BigDecimal;

public class BankingWithdrawalService {
    private Account account;
    // private WithdrawableAccount account;

    public BankingWithdrawalService(Account account) {
        this.account = account;
    }

    public void withdraw(BigDecimal amount) {
        account.withdraw(amount);
    }
}

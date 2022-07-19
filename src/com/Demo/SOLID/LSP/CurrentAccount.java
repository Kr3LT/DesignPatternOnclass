package com.Demo.SOLID.LSP;

import java.math.BigDecimal;

public class CurrentAccount extends Account {// extends WithdrawableAccount{
    @Override
    protected void deposit(BigDecimal amount) {
        this.deposited = amount;
    }

    @Override
    protected void withdraw(BigDecimal amount) {
        this.deposited = this.deposited.subtract(amount);
        System.out.println("withdraw : " + amount);
    }
}

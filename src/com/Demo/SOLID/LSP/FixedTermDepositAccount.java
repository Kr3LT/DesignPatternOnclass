package com.Demo.SOLID.LSP;

import java.math.BigDecimal;

public class FixedTermDepositAccount extends Account{
        @Override
        protected void deposit(BigDecimal amount) {
            this.deposited = amount;
        }

        @Override
        protected void withdraw(BigDecimal amount) {
            throw new UnsupportedOperationException("Withdrawals are not supported by FixedTermDepositAccount!!");
        }

}

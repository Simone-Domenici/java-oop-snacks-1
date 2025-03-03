package org.lessons.snacks;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ContoBancario {
    private int accountNumber;
    private BigDecimal balance;

    public ContoBancario(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = new BigDecimal(0);
    }

    public void addBalance( BigDecimal balance) {
        this.balance = this.balance.add(balance).setScale(2,RoundingMode.DOWN);
    }

    public void withdrawBalance (BigDecimal balance) {
        this.balance = this.balance.subtract(balance).setScale(2,RoundingMode.DOWN);
    }

    public BigDecimal getBalance() {
        return this.balance;
    }
}

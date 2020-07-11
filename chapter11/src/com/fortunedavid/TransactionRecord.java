package com.fortunedavid;

public class TransactionRecord {
    private int accountNumber;
    private double amount;

    public int getAccountNumber() {
        return accountNumber;
    }

    public TransactionRecord setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    public double getAmount() {
        return amount;
    }

    public TransactionRecord setAmount(double amount) {
        this.amount = amount;
        return this;
    }
}

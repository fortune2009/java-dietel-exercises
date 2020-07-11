package com.fortunedavid;

public class Main {

    public static void main(String[] args) {
        SavingAccount saver1 = new SavingAccount();
        SavingAccount saver2 = new SavingAccount();

        saver1.setSavingsBalance(2000.00);
        saver2.setSavingsBalance(3000.00);
        SavingAccount.setAnnualInterestRate(0.04);
        saver1.setCurrentDeposit();
        saver2.setCurrentDeposit();
        System.out.println(saver1.getCurrentDeposit());
        System.out.println(saver2.getCurrentDeposit());
        System.out.println();

        SavingAccount.setAnnualInterestRate(0.05);
        saver1.setCurrentDeposit();
        saver2.setCurrentDeposit();
        System.out.println(saver1.getCurrentDeposit());
        System.out.println(saver2.getCurrentDeposit());

    }
}

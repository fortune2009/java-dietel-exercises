package com.fortunedavid;

public class SavingAccount {
    private static double annualInterestRate;
    private double savingsBalance;
    private double currentDeposit;


    public double calculateMonthlyinterest(double savingsBalance, double annualInterestRate){
        return (savingsBalance*annualInterestRate) / 12;
    }

    public double calculateMonthlyinterest(){
        return (savingsBalance*annualInterestRate) / 12;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        SavingAccount.annualInterestRate = annualInterestRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public SavingAccount setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
        return this;
    }

    public double getCurrentDeposit() {
        return currentDeposit;
    }

    public void setCurrentDeposit() {
        double currentDeposit = calculateMonthlyinterest() + savingsBalance;
        this.currentDeposit = currentDeposit;
    }
}

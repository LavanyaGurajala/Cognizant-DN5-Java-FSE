package com.loan.model;

public class Loan {

    private String number;
    private String loanType;
    private double amount;

    public Loan() {
    }

    public Loan(String number, String loanType, double amount) {
        this.number = number;
        this.loanType = loanType;
        this.amount = amount;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

package com.account.model;

public class Account {

    private String number;
    private String accountType;
    private double balance;

    public Account() {
    }

    public Account(String number, String accountType, double balance) {
        this.number = number;
        this.accountType = accountType;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

package com.company;

public class InsufficientFundsException extends Exception {

    private int balance = 0;

    public InsufficientFundsException() {

    }

    public InsufficientFundsException(String message) {
        super(message);
    }

    public InsufficientFundsException(String message, int balanceParam) {
        super(message);
        balance = balanceParam;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}

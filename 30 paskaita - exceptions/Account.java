package com.company;

public class Account {

    private int balance = 100;

    public void withdraw(int amount) throws InsufficientFundsException {

        if (balance - amount >= 0) {
            balance -= amount;
            System.out.println("Nuimta " + amount + " pinigu, saskaitos likutis: " + balance);
        }
        else {
            throw new InsufficientFundsException("Saskaitoje nepakanka pinigu", balance - amount);
        }
        System.out.println("Bandau toliau vykdyti");

    }
}

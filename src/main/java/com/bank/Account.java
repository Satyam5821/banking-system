package com.bank;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient funds");
        }
        balance -= amount; // issue: still deducting
    }

    public double getBalance() {
        return balance;
    }
}
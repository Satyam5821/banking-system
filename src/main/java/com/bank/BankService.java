package com.bank;

public class BankService {

    public static void main(String[] args) {
        Account acc = new Account("John", 1000);

        acc.withdraw(1500); // issue

        String str = null;
        System.out.println(str.length()); // NullPointer issue
    }
}
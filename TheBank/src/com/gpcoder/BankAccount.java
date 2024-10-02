package com.gpcoder;

public abstract class BankAccount {

	String accountNumber;
    double balance;
    double amount;

    
    public BankAccount(String accountNumber, long balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0)
    	balance += amount;
        else {
        	System.out.println("Don't have enough money!");
        }
    }

    public abstract void withdraw(double amount); 

    public double getBalance() {
        return balance;
    }
}
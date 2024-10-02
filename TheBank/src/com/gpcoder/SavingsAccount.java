package com.gpcoder;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, long balance) {
        super(accountNumber, balance);
    }
    
    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount < 100000) {
            System.out.println("Warning: Minimum balance of 100000 VND required!");
        } else {
            balance -= amount; 
        }
    }
}
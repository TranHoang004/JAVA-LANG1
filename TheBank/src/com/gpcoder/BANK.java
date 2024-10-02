package com.gpcoder;

public class BANK {	
	
    public static void main(String[] args) {

    	
        BankAccount TH1509 = new SavingsAccount("TH1509", 500000);

        TH1509.deposit(100000);	
        System.out.println("New balance after depositing 100000 VND: " + TH1509.getBalance());
        TH1509.withdraw(600000);
        System.out.println("New balance after withdrawing 600000 VND: " + TH1509.getBalance());

    }
}
package com.hoangoop;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static double calculateTotal(List<Payable> payables) {
        double total = 0;
        for (Payable p : payables) {
            total += p.getPaymentAmount();
        }
        return total;
    }
    public static void main(String[] args) {
        List<Payable> payables = new ArrayList<>();

        payables.add(new Student("Hoàng", 21, "S001", 5000));
        payables.add(new Student("Mai", 20, "S002", 6000));
        payables.add(new Teacher("Lan", 35, "T001", 15000));
        payables.add(new Teacher("Minh", 40, "T002", 18000));

        double total = calculateTotal(payables);
        System.out.println("Total money the school handles: " + total);
    }
}
	

package com.hoangoop;

public class Student extends Person implements Payable {
    private String studentId;
    private double tuitionFee;

    public Student(String name, int age, String studentId, double tuitionFee) {
        super(name, age);
        this.studentId = studentId;
        this.tuitionFee = tuitionFee;
    }

    @Override
    public void introduce() {
        System.out.printf("I am student %s, %d years old, ID: %s%n",
                          getName(), getAge(), studentId);
    }

    @Override
    public double getPaymentAmount() {
        return tuitionFee;
    }
}


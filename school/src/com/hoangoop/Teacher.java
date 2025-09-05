package com.hoangoop;

public class Teacher extends Person implements Payable {
    private String teacherId;
    private double salary;

    public Teacher(String name, int age, String teacherId, double salary) {
        super(name, age);
        this.teacherId = teacherId;
        this.salary = salary;
    }

    @Override
    public void introduce() {
        System.out.printf("I am teacher %s, %d years old, ID: %s%n",
                          getName(), getAge(), teacherId);
    }

    @Override
    public double getPaymentAmount() {
        return salary;
    }
}


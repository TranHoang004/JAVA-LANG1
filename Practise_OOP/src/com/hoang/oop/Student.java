package com.hoang.oop;

public class Student extends Person{
    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public void introduce() {
        System.out.printf("I am student %s, %d years old, ID: %s%n", 
                          getName(), getAge(), studentId);
    }
}

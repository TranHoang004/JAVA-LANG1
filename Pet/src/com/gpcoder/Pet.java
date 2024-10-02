package com.gpcoder;

public abstract class Pet {
    private String name;
    private int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return this.name;
    }

    public abstract  void sound();
    public abstract  void bite();

    public void eat() {
        System.out.println(this.name + " is eating now!");
    }
    public void move() {
        System.out.println(this.name + " is moving now!");
    }
    public void age() {
        System.out.println(this.name + " is "+age+" years old!");
    }
}
package com.gpcoder;

public class Dog extends Pet {
    public Dog(String name, int age) {
        super(name, age);
    }
    public void sound() {
        System.out.println(getName() + " is barking now!");
    }
        public void bite() {
    	System.out.println(getName()  + "is bitting!");
        }
}


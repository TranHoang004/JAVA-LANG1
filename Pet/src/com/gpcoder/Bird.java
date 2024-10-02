package com.gpcoder;

public class Bird extends Pet {
    public Bird(String name, int age) {
        super(name, age);
    }
    public void sound() {
        System.out.println(getName() + " is chirping now!");
    }
	public void bite() {
		System.out.println(getName()  + "is pecking!");
		
	}
}
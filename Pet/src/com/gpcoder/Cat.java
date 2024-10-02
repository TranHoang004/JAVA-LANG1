package com.gpcoder;

public class Cat extends Pet {
    public Cat(String name, int age) {
        super(name, age);
    }
    public void sound() {
        System.out.println(getName() + " is meowing now!");
    }
	public void bite() {
		System.out.println(getName()  + "is scratching!");
    }	
}

package com.gpcoder;

public class People {

	public static void main(String[] args) {
        Person person1 = new Person("John", 30);
        Person person2 = new Person("Alice", 25);
        
        System.out.println("Person 1: Name = " + person1.getName() + ", Age = " + person1.age());
        System.out.println("Person 2: Name = " + person2.getName() + ", Age = " + person2.age());
	}
	
}

package com.gpcoder;

	import java.util.Arrays;
	import java.util.List;

	public class myPet {
	    public static void main(String[] args) {
	        List<Pet> pets = Arrays.asList(
	            new Dog("Max", 5),
	            new Cat("Bella", 4),
	            new Bird("Charlie", 2)
	        );

	        for (Pet pet : pets) {
	        	pet.age();
	        	pet.eat();
	            pet.move();
	            pet.sound();
	            pet.bite();
	    }
	}
}
package com.gpcoder;

public class Flyable {

	public static void main(String[] args) {
		/*Airplane plane = new Airplane();
		Helicopter helicopter = new Helicopter();
		Spacecraft spacecraft = new Spacecraft();
		
		plane.fly_obj();
		helicopter.fly_obj();
		spacecraft.fly_obj();*/
		
		// Array
		Vehicle[] flyingObjects = { new Spacecraft(), new Airplane(), new Helicopter() };
		for (Vehicle obj : flyingObjects) {
	            obj.fly_obj();
		}
	}
}

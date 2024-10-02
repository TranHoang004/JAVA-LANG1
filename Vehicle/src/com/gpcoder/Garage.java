package com.gpcoder;

public class Garage {

	private double speed;
	
	public void speedUp (double acceleration) {
		speed += acceleration;
		System.out.println("Vehicle speed increased by " + acceleration + " units.");
	}
	public double getSpeed(){
		return speed;
	}
}

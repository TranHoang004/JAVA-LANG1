package com.gpcoder;

public class CarFactory {
	    public static void main(String[] args) {
	        Car hondaCivic = new Car("HondaCivic","green", 1972);
	        Car toyotaCorolla = new Car("ToyotaCrolla","blue", 1966);
	        Car vinfastLux = new Car("VinfastLux","red", 2018);
	        hondaCivic.drive();
	        toyotaCorolla.drive();
	        vinfastLux.drive();
	        hondaCivic.stop();
	        toyotaCorolla.stop();
	        vinfastLux.stop();
	}
}

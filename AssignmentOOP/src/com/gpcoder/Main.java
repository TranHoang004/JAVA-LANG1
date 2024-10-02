package com.gpcoder;

public class Main {

	public static void main(String[] args) {
		        Car car1 = new Car("Honda City", 2022, "VJM1775");
		        Car car2 = new Car("Toyota Vios", 2019, "VME841");

		        car1.displayDetails();
		        car2.displayDetails();
		        car1.compareCarNumber(car2);
		        car1.running();
		        car2.running();

	}
}

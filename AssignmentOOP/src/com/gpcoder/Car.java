package com.gpcoder;

public class Car {
    // Attributes (private data fields)
	private String model;			// The car model
	private int yearMade;			// The year the car was manufactured
	private String carNumber;		// The car's license plate number
	
    // Constructors
	public Car(String model, int yearMade) {
		this.model=model;
		this.yearMade=yearMade;		
	}
	
	public Car(String model, int yearMade, String carNumber) {
		this.model=model;
		this.yearMade=yearMade;
		this.carNumber=carNumber;		
	}

    // Getter methods
	public String getModel() {
		return model;
	}
	
	public int getYearMade() {
		return yearMade;
	}
	
	public String getCarNumber() {
		return carNumber;
	}
	
	//Setter methods
    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }
    
    // Display car details
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Model: " + model);
        System.out.println("Year Made: " + yearMade);
        System.out.println("Car Number: " + carNumber);
    }
    
    // Compare car numbers
    public void compareCarNumber(Car otherCar) {
        if (carNumber.equals(otherCar.getCarNumber())) {
            
        	System.out.println("Alert: Both cars have the same car number.");
        } 
        else {
            
        	System.out.println("Car numbers are different.");
        }
    }
    
    //Non-getter & Non-setter methods
    public void running() {
        System.out.println(model+" is running!");
    }
}

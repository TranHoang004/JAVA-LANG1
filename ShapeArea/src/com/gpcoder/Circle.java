package com.gpcoder;

public class Circle extends Shape {
	private double radius;

	    public Circle(double radius) {
	        if (radius > 0) {
	            this.radius = radius;
	        } else {
	            System.out.println("The radius have to above 0.");
	        }
	    }
	    
	    @Override
	    public double calculateArea() {
	        return Math.PI*radius*radius; 
	    
	}
}

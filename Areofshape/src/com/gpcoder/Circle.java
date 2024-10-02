package com.gpcoder;

public class Circle extends Shape{
	protected double radius;
	
	public Circle(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("The radius have to above 0.");
            }
        }
        @Override
	    public double calculateArea() {
	        return Math.PI *radius*radius; 
	        }
        public double calculatePerimeter() {
	        return Math.PI * 2 * radius; 
	        }
}
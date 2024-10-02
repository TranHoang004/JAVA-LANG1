package com.gpcoder;

public class ShapeArea {
    public static void main(String[] args) {
    	
    	 Rectangle rectangle = new Rectangle(100, 34);
         System.out.println("\nRectangular area: " + rectangle.calculateArea());
         
         Circle circle = new Circle(45);
         System.out.println("\nRectangular area: " + circle.calculateArea());
         
         Triangle triangle = new Triangle(20, 34);
         System.out.println("\nRectangular area: " + triangle.calculateArea());
    }
}
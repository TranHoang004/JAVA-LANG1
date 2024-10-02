package com.gpcoder;

public class ShapeArea {
    public static void main(String[] args) {
    	
    	Rectangle rectangle = new Rectangle(100, 34);
    	System.out.println("\nRectangular area: " + rectangle.calculateArea());
    	System.out.println("\nRectangular perimeter: " + rectangle.calculatePerimeter());
    	
     	Circle circle = new Circle(50);
        System.out.println("\nCircle area: " + circle.calculateArea());
        System.out.println("\nCircle perimeter: " + circle.calculatePerimeter());      
    }
}
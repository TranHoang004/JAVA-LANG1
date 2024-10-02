package com.gpcoder;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(double width, double height) {
        if (width > 0 && height > 0) {
            this.width = width;
            this.length = height;
        } else {
            System.out.println("Width and height have to above 0.");
        }
    }
    
    @Override
    public double calculateArea() {
        return width * length; 
    }
}
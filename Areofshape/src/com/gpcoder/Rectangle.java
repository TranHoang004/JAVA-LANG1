package com.gpcoder;

public class Rectangle extends Shape{
	private double width;
	private double height;

    public Rectangle(double width, double height) {
        if (width > 0 && height > 0) {
            this.width = width;
            this.height = height;
        } else {
            System.out.println("Width and height have to above 0.");
        }
    }
	@Override
	public double calculateArea() {
        return width * height; 
        }
	public double calculatePerimeter() {
		return (width + height)*2;
		}
}
package com.gpcoder;

public class Triangle extends Shape {

	public double height;
	public double base;
	
    public Triangle(double height, double base){
        if (height > 0 && base >0) {
            this.height= height;
            this.base = base;
        } else {
            System.out.println("The height and base have to above 0.");
        }
    }
    
    @Override
    public double calculateArea() {
        return (base*height)/2; 
    
    }
}

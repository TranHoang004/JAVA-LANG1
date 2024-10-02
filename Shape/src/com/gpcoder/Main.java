package com.gpcoder;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5.0, 3.0);
        Circle circle = new Circle(2.5);
        Triangle triangle = new Triangle(4.0, 6.0);

        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Triangle area: " + triangle.getArea());
    }
}
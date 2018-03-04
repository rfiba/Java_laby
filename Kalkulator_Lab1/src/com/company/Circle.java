package com.company;

public class Circle extends Figure implements Print {
    private double radius;

    Circle(double radiusToAdd) throws IllegalArgumentException
    {
        if(radiusToAdd < 0)
            throw new IllegalArgumentException("Argument < 0");

        radius = radiusToAdd;
    }

    @Override
    double calculateArea() {
        return 3.14*radius*radius;
    }

    @Override
    double calculatePerimeter() {
        return 2*3.14*radius;
    }

    @Override
    public void print() {
        System.out.format("Radius of circle: %f\n", radius);
        System.out.format("Area and perimeter of circle: %f, %f", calculateArea(), calculatePerimeter());
    }
}

package com.company;

public class Square extends Figure implements Print {
    private double side;

    Square(double sideToAdd) throws IllegalArgumentException
    {
        if(sideToAdd < 0)
            throw new IllegalArgumentException("Argument < 0");
        side = sideToAdd;
    }

    @Override
    double calculatePerimeter() {
        return 4*side;
    }

    @Override
    double calculateArea() {
        return side*side;
    }

    @Override
    public void print() {
        System.out.format("Side of square: %f\n", side);
        System.out.format("Area and perimeter of square\n: %f, %f", calculateArea(), calculatePerimeter());
    }
}

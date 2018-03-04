package com.company;

public class Triangle extends Figure implements Print {
    private double aSide;
    private double bSide;
    private double cSide;

    Triangle(double aSideToAdd, double bSideToAdd, double cSideToAdd) throws IllegalArgumentException {
        if (aSideToAdd < 0 || bSideToAdd < 0 || cSideToAdd < 0 )
            throw new IllegalArgumentException("Argument < 0");
        aSide = aSideToAdd;
        bSide = bSideToAdd;
        cSide = cSideToAdd;
    }

    @Override
    double calculateArea() {
        double perimeter = calculatePerimeter();
        return java.lang.Math.sqrt(perimeter*(perimeter-aSide)*(perimeter-bSide)*(perimeter-cSide));
    }

    @Override
    double calculatePerimeter() {
        return aSide + bSide + cSide;
    }

    @Override
    public void print() {
        System.out.format("Sides of trinagle are: %f %f %f\n",aSide, bSide, cSide);
        System.out.format("Area and perimeter of trinagle are: %f, %f\n", calculateArea(), calculatePerimeter());
    }
}

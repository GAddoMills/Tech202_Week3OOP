package com.sparta.O;

public class Circle implements Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    /**
     * Required fixes to abide by the O of SOLID
     * Also must now implement Shape
     */

    public Circle(){}

    @Override
    public double areaCalculation() {
        return Math.pow(getRadius(), 2) * Math.PI;
    }
}

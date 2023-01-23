package com.sparta.O;

public class ShapeArea {
    /**
     * Following code is a problem for the O of SOLID.
     * In order to calculate the area of a new shape, we would have to come into this class and create a new method
     * (by modifying the class).
     */
    public double areaCalculationRectangle(Rectangle r){
        return r.getLength() * r.getWidth();
    }

    public double areaCalculationCircle(Circle c){
        return Math.pow(c.getRadius(), 2) * Math.PI;
    }


    //THIS CLASS SHOULDNT BE OPEN FOR MODIFICATION
    /**
     * The code below solves the problem by creating more layers of abstraction
     * We also need the Shape interface...
     */

    public static double calculateArea(Shape shape){
        return shape.areaCalculation();
    }
}

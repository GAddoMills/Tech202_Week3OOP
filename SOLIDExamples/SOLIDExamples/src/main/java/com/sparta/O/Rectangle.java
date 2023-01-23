package com.sparta.O;

public class Rectangle implements Shape{
    private double length;          // default to 0.0
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    /**
     * Required fixes to abide by the O of SOLID
     * Also must now implement Shape
     */
    public Rectangle(){}

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double areaCalculation(){
        return getWidth() * getLength();
    }
}

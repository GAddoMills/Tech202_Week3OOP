package com.sparta.gam.SafariPark.shapes;

import java.text.DecimalFormat;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Objects;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        double result = width * height;
        result = Math.round(result*100.0)/100.0;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.width, width) == 0 && Double.compare(rectangle.height, height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }


}

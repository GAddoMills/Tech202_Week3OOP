package com.sparta.gam.SafariPark.shapes;

import java.util.Formatter;

public abstract class Shape {
    public abstract double calculateArea();
    public String getName(){
        return "This is a " + getClass().getSimpleName();


    }

}

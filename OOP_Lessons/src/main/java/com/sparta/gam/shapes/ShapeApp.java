package com.sparta.gam.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapeApp {
    public static void main(String[] args) {
//        Shape s = new Shape(); SHAPE IS ABSTRACT
        var myRect = new Rectangle(3.2,3.0);
        System.out.println(myRect.calculateArea());

        var myCircle = new Circle(2.0);
        System.out.println(myCircle.calculateArea());

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(myRect);
        myShapes.add(myCircle);
        myShapes.add(new Circle(4.0));
        System.out.println("Demo of polymorphism");
        for (Shape s : myShapes){
            System.out.println(s.calculateArea());
        }

    }
}

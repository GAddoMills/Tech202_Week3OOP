package com.sparta.gam.SafariPark.shapes;

public class ShapeApp {
    public static void main(String[] args) {
        Shape rect1 = new Rectangle(4,6);
        Shape circle1 = new Circle(2);
        Shape rect2 = new Rectangle(2.113,2.4);

        System.out.println(rect1.getName());
        System.out.println(rect1.calculateArea());
        System.out.println(rect2.calculateArea());

        System.out.println(circle1.getName());
        System.out.println(circle1.calculateArea());

        Shape rect3 = new Rectangle(1,2);
        Shape rectE = rect3;
        Shape rect4 = new Rectangle(1,2);



        //BEFORE:AFTER
        var threeEqualsE = rect3 == rectE; //TRUE:TRUE
        var threeEqualsFour = rect3 == rect4; //FALSE: FALSE

        var threeEqualsE2 = rect3.equals(rectE); //TRUE:TRUE
        var threeEqualsFour2 = rect3.equals(rect4); //FALSE:TRUE

        Shape c1 = new Circle(4);
        Shape c2 = c1;
        Shape c3 = new Circle(4);

        //BEFORE:AFTER
        var c1OperatorEqc2 = c1 == c2; //TRUE:TRUE
        var c1OperatorEqc3 = c1 == c3; //FALSE: FALSE

        var c1Eqc2 = c1.equals(c2); //TRUE:TRUE
        var c1Eqc3 = c1.equals(c3); //FALSE:TRUE
    }


}

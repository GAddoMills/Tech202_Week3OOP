package com.sparta;

import com.sparta.D.Blender;
import com.sparta.D.ElectricPowerSwitch;
import com.sparta.D.Fan;
import com.sparta.D.LightBulb;
import com.sparta.L.Square;
import com.sparta.O.Circle;
import com.sparta.O.Rectangle;
import com.sparta.O.Shape;
import com.sparta.O.ShapeArea;
import com.sparta.S.PrintStudentDetails;
import com.sparta.S.Student;

public class Starter {
    public static void start(){
        Student fredM = new Student("Fred Mathews", "Java Dev");
//        fredM.printDetails();
        PrintStudentDetails.printDetails(fredM);

        Circle myCircle = new Circle();
        System.out.println(myCircle.areaCalculation());

        Shape rect = new Rectangle(12, 3);
        System.out.println(ShapeArea.calculateArea(rect));

        Rectangle sq = new Square(4);
        System.out.println(sq.areaCalculation());

        LightBulb lit = new LightBulb();
        Fan fan = new Fan();
        Blender veggieBlender = new Blender();
        Fan standingFan = new Fan();
        Fan handheldFan = new Fan();



// Any of these objects can be passed as parameter to the ElectricPowerSwitch:



        ElectricPowerSwitch ella = new ElectricPowerSwitch(veggieBlender);
        System.out.println(ella.isOn());
        ella.press();
        System.out.println(ella.isOn());
        ella.press();
        System.out.println(ella.isOn());
    }
}

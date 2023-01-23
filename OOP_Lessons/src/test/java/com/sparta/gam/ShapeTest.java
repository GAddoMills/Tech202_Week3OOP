package com.sparta.gam;

import com.sparta.gam.SafariPark.shapes.Circle;
import com.sparta.gam.SafariPark.shapes.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;



public class ShapeTest {

    @Test
    @DisplayName("Testing output of correct shape name for Rectangle")
    public void shapeNameTestRectangle(){
        Rectangle rect = new Rectangle(5.0,8.0);
        Assertions.assertEquals("This is a Rectangle", rect.getName());
    }

    @Test
    @DisplayName("Testing output of correct shape name for Circle")
    public void shapeNameTestCircle(){
        Circle c = new Circle(8.0);
        Assertions.assertEquals("This is a Circle", c.getName());
    }

    @ParameterizedTest
    @CsvSource({
            "2.0, 3.0, 6.0",
            "56.3, 86.1, 4847.43",
            "12.2, 35.1, 428.22"
    })
    @DisplayName("Given doubles width and length, calculateArea outputs correct area result")
    public void givenDoubleWidthAndLength_calculateArea_OutputCorrectArea(double width, double height, double result){
        Rectangle r = new Rectangle(width, height);
        Assertions.assertEquals(result, r.calculateArea() );
    }

    @ParameterizedTest
    @CsvSource({
            "9.0, 254.47",
            "4.5, 63.62",
            "37.596, 4440.51",
            "6.4832, 132.05"
    })
    @DisplayName("Fiven double radius, calculateArea outputs correct area result")
    public void givenDoubleRadius_calculateArea_OutputCorrectArea(double radius, double result){
        Circle c = new Circle(radius);
        Assertions.assertEquals(result, c.calculateArea());
    }

    @Test
    @DisplayName("Given two rectangles, equals() returns true they are the same")
    public void givenTwoRectangles_equals_ReturnsTrueTheyAreTheSame(){
        Rectangle rec1= new Rectangle(7,8);
        Rectangle rec3 = new Rectangle(7,8);
        Assertions.assertTrue(rec1.equals(rec3));
    }

    @Test
    @DisplayName("Given two rectangles, assignment operator returns false they are not the same")
    public void givenTwoRectangles_assignmentOperator_ReturnsFalseTheyAreTheSame(){
        Rectangle rec1= new Rectangle(7,8);
        Rectangle rec3 = new Rectangle(7,8);
        Assertions.assertFalse(rec1 == rec3);
    }

    @Test
    @DisplayName("Given two circles, equals() returns true they are the same")
    public void givenTwoCircle_equals_ReturnsTrueTheyAreTheSame(){
        Circle c = new Circle(5);
        Circle c1 = new Circle(5);
        Assertions.assertTrue(c.equals(c1));
    }

    @Test
    @DisplayName("Given two circles, assignment operator retunrs false they are not the same")
    public void givenTwoCircles_assignmentOperator_ReturnsTrueTheyAreTheSame(){
        Circle c = new Circle(5);
        Circle c1 = new Circle(5);
        Assertions.assertFalse(c == c1);
    }
}

package com.sparta.gam;

import com.sparta.gam.SafariPark.Airplane;
import com.sparta.gam.SafariPark.Person;
import com.sparta.gam.SafariPark.Vehicle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class VehicleTest {

    @Test
    @DisplayName("When a vehicle is constructed they have the correct posiition")
    public  void testPosition(){
        Vehicle v = new Vehicle(2, 1, 0, 10);
        var result = v.getPosition();
        Assertions.assertEquals(0,result);
    }

    @Test
    @DisplayName("When a vehicle is constructed they have the correct speed")
    public  void testSpeed(){
        Vehicle v = new Vehicle(2, 1, 0, 10);
        var result = v.getSpeed();
        Assertions.assertEquals(10,result);
    }

//    @ParameterizedTest
//    @DisplayName("When a vehicle is constructed and speed is null, getSpeed should return 10")
//    @CsvSource({
//            ", 10",
//            " , 10",
//
//    })
//    public void testDefaultSpeed(int speed, int expected) {
//        Vehicle v = new Vehicle(2, 1, 0, speed);
//        var result = v.getSpeed();
//        Assertions.assertEquals(expected,result);
//    }
//
//    @ParameterizedTest
//    @DisplayName("When a vehicle is constructed and speed is null, getCapacity should return 4")
//    @CsvSource({
//            ", 4",
//            " , 4",
//
//    })
//    public void testDefaultCapacity(int capacity, int expected) {
//        Vehicle v = new Vehicle(2, 1, 0, 10);
//        var result = v.getCapacity();
//        Assertions.assertEquals(expected,result);
//    }

    @ParameterizedTest
    @DisplayName("Test to check correct number of Passengers")
    @CsvSource({
            "3, 3",
            "1, 1",
            "10, 5",
            "1000, 5"
    })
    public void testNumPassengers(int inputPassegers, int expectedPass){
        Vehicle v = new Vehicle(6, 5, 0, 10);
        v.setNumPassengers(inputPassegers);
        Assertions.assertEquals(expectedPass,v.getNumPassengers());
    }

    //AIRPLANE TESTS

    @Test
    @DisplayName("Test correct capacity")
    public void testAirplaneCapacity(){
        Airplane a= new Airplane(200, 60, "Plane");
        Assertions.assertEquals(200, a.getCapacity());
    }

    @Test
    @DisplayName("Test correct speed")
    public void testAirplaneSpeed(){
        Airplane a= new Airplane(200, 60, "Plane");
        Assertions.assertEquals(60, a.getSpeed());
    }

    @Test
    @DisplayName("Test correct name")
    public void testAirplaneName(){
        Airplane a= new Airplane(200, 60, "Plane");
        Assertions.assertEquals("Plane", a.getAirline());
    }

    @ParameterizedTest
    @DisplayName("Test to check correct number altitude")
    @CsvSource({
            "20, 20",
            "53, 53",
            "0, 0"

    })
    public void testAltitude(int inputAscend, int expectedAltitude){
        Airplane a= new Airplane(200, 60, "Plane");
        a.ascend(inputAscend);
        Assertions.assertEquals(expectedAltitude,a.getAltitude());
    }

    @Test
    @DisplayName("Test to check correct number altitude")
    public void testAltitudeDescend(){
        Airplane a= new Airplane(200, 60, "Plane");
        a.ascend(50);
        a.descend(20);
        Assertions.assertEquals(30,a.getAltitude());
    }


}

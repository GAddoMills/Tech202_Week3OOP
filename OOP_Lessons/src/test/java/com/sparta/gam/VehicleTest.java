package com.sparta.gam;

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

    @ParameterizedTest
    @DisplayName("When a vehicle is constructed and speed is null, getSpeed should return 10")
    @CsvSource({
            ", 10",
            " , 10",

    })
    public void testDefaultSpeed(int speed, int expected) {
        Vehicle v = new Vehicle(2, 1, 0, speed);
        var result = v.getSpeed();
        Assertions.assertEquals(expected,result);
    }

    @ParameterizedTest
    @DisplayName("When a vehicle is constructed and speed is null, getCapacity should return 4")
    @CsvSource({
            ", 4",
            " , 4",

    })
    public void testDefaultCapacity(int capacity, int expected) {
        Vehicle v = new Vehicle(2, 1, 0, 10);
        var result = v.getCapacity();
        Assertions.assertEquals(expected,result);
    }
}

package com.sparta.gam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PlanetTests {

    @Test
    @DisplayName("Given a planet, test to see correct name")
    public void testNamePlanet(){
        Assertions.assertEquals("Mercury", Planet.MERCURY.getPlanetName());
    }

    @Test
    @DisplayName("Test to check new planet net is equal to Mercury")
    public void testEqualToMercury(){
        Planet net = Planet.MERCURY;
        Assertions.assertTrue(net.equals(Planet.MERCURY));
    }

    @Test
    @DisplayName("Test to check new planet equal operator to Mercury")
    public void testEqualOperatorToMercury(){
        Planet net = Planet.MERCURY;
        Assertions.assertTrue(net == Planet.MERCURY);
    }


}

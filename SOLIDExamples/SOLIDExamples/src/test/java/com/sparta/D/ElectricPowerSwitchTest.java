package com.sparta.D;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElectricPowerSwitchTest {
    @Test
    @DisplayName("testPress testing method")
    public void testPress() throws Exception{
        Switchable switchableBulb = new LightBulb();
        Switch bulbPowerSwitch = new ElectricPowerSwitch(switchableBulb);
        bulbPowerSwitch.press();

        Assertions.assertTrue(bulbPowerSwitch.isOn());

        bulbPowerSwitch.press();

        Assertions.assertFalse(bulbPowerSwitch.isOn());

        Switchable switchableFan=new Fan();
        Switch fanPowerSwitch=new ElectricPowerSwitch(switchableFan);
        fanPowerSwitch.press();
        fanPowerSwitch.press();
    }

}
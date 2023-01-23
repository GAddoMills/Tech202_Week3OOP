package com.sparta.D;

//public class ElectricPowerSwitch {
//
//    public LightBulb lightBulb;
//    public boolean on;
//
//    public ElectricPowerSwitch(LightBulb lightBulb) {
//        this.lightBulb = lightBulb;
//        this.on = false;
//    }
//    public boolean isOn() {
//        return this.on;
//    }
//    public void press(){
//        boolean checkOn = isOn();
//        if (checkOn) {
//            lightBulb.turnOff();
//            this.on = false;
//        } else {
//            lightBulb.turnOn();
//            this.on = true;
//        }
//    }
//}

    /**
     * The mistake we have made:
     * Our high-level ElectricPowerSwitch class is directly dependent on the low-level LightBulb class
     * A switch should not be tied to a particular bulb. It should be able to switch on and off other appliances.
     * E.g. a fan, the AC, or the entire lighting system for the building.
     *
     * Now, imagine the modifications we will require in the ElectricPowerSwitch class each time we add a new
     * appliance or device. We can conclude that our design is flawed, and we need to revisit it by following the
     * Dependency Inversion Principle.
     */


    public class ElectricPowerSwitch implements Switch{
    public Switchable client;
    public boolean on;
    public ElectricPowerSwitch(Switchable client) {
        this.client = client;
        this.on = false;
    }
    public boolean isOn() {
        return this.on;
    }
    public void press(){
        boolean checkOn = isOn();
        if (checkOn) {
            client.turnOff();
            this.on = false;
        } else {
            client.turnOn();
            this.on = true;
        }
    }
}

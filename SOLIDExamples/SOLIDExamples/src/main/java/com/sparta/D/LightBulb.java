package com.sparta.D;

/**
 * Use the following link to explain these pages
 * https://springframework.guru/principles-of-object-oriented-design/dependency-inversion-principle/
 */

//public class LightBulb {
//    public void turnOn() {
//        System.out.println("LightBulb: Bulb turned on...");
//    }
//    public void turnOff() {
//        System.out.println("LightBulb: Bulb turned off...");
//    }
//}

public class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("LightBulb: Bulb turned on...");
    }
    @Override
    public void turnOff() {
        System.out.println("LightBulb: Bulb turned off...");
    }
}

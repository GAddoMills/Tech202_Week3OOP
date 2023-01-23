package com.sparta.D;

public class Blender implements Switchable{
    @Override
    public void turnOn() {
        System.out.println("Blender: Blender turns on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Blender: Blender turns off...");
    }
}

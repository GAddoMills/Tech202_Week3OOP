package com.sparta.gam.SafariPark;

public class WaterPistol extends Weapon{
    public WaterPistol(String brand){
        super(brand);
    };

    @Override
    public String shoot() {
        return "Splash!! Shooting a WaterPistol - " + super.shoot();
    }

    @Override
    public String toString() {
        return "WaterPistol{}";
    }
}

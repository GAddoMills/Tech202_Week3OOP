package com.sparta.gam.SafariPark;

public abstract class Weapon implements IShootable{

    private String brand = "";

    public Weapon(String brand){
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "brand='" + brand + '\'' +
                '}';
    }

    @Override
    public String shoot() {
        return brand;
    }
}

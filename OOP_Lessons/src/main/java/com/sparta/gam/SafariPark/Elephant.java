package com.sparta.gam.SafariPark;

public class Elephant extends Species{
    public Elephant(String species){
        super(species);
    }

    @Override
    public String feed() {
        return "Pheww!! " + super.feed() + " is eating hay.";
    }
}

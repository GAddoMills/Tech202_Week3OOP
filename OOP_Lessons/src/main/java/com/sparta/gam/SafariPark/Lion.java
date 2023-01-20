package com.sparta.gam.SafariPark;

public class Lion extends Species{
    public Lion(String species){
        super(species);
    }

    @Override
    public String feed() {
        return "Roar!! " + super.feed() + " is eating meat.";
    }
}

package com.sparta.gam.SafariPark;

public class Animal implements IFeedable{
    private String species = "";

    public Animal(String species){
        this.species = species;
    };

    @Override
    public String feed() {
        return "feeding an " + species + ".";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animal='" + species + '\'' +
                '}';
    }
}

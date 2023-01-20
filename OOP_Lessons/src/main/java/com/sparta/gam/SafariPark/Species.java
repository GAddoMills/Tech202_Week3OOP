package com.sparta.gam.SafariPark;

public abstract class Species implements IFeedable{

    private String species = "";

    public Species(String species){
        this.species = species;
    }

    @Override
    public String feed() {
        return species;
    }

    @Override
    public String toString() {
        return "Species{" +
                "species='" + species + '\'' +
                '}';
    }
}

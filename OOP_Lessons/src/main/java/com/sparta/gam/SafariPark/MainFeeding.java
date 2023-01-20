package com.sparta.gam.SafariPark;

import java.util.ArrayList;

public class MainFeeding {
    public static void main(String[] args) {
        ArrayList<IFeedable> feedObjects = new ArrayList<>();

        Elephant dumbo = new Elephant("Dumbo");
        Lion simba = new Lion("Simba");
        Animal animal = new Animal("Animal");
        Visitor sarah = new Visitor("Sarah", "Manera", 25, animal);


        //CHECK OBJECTS
        feedObjects.add(sarah);
        feedObjects.add(dumbo);
        feedObjects.add(simba);

        for (IFeedable i : feedObjects){
            System.out.println(i.feed());
        }

        //CALL ROLL
        System.out.println("POLYMORPHISM");
        System.out.println(sarah.feed());
        sarah.setFeedable(dumbo);
        System.out.println(sarah.feed());
        sarah.setFeedable(simba);
        System.out.println(sarah.feed());

    }
}

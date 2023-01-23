package com.sparta.gam.SafariPark;

import java.util.ArrayList;
import java.util.Collections;

public class EqualityApp {
    public static void main(String[] args) {
        var bobOne= new Person("Bob", "Builder", 25);
        var bobTwo = bobOne; //same memory address
        var areSame= bobOne.equals(bobTwo); //true
        var sameWithEqualityOperator = bobOne == bobTwo; //compares the memory address true

        //== checks the memory address
        var bobThree = new Person("Bob", "Builder", 25);
        var areSameOneThree = bobOne.equals(bobThree);
        //true after we override the Object equals() method
        var areSameOneThreeOperator = bobOne == bobThree; // compare addresses, false

        //object equals() methods compares memory address like ==


        ArrayList<Person> pList = new ArrayList<>();
        pList.add(new Person("Cath", "Cookson", 22));
        pList.add(new Person("Dan", "Dare", 40));
        pList.add(new Person("Bob", "Builder", 25));
        pList.add(new Person("Dan", "Dare", 35));
        pList.add(new Person("Amy", "Andrews", 60));

        var hasBob = pList.contains(bobOne); //true only if we override the Object equals method

        //String equality
        String one = "Hello World";
        String two = "Hello World";
        String three = new String("Hello World");

        var rEquals12 = one == two; //true
        var rEquals13 = one == three; //false

        var oEquals12 = one.equals(two); //true
        var oEquals13 = one.equals(three); //three

        Collections.sort(pList);
    }
}

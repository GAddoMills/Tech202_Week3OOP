package com.sparta.gam;

import com.sparta.gam.SafariPark.Hunter;
import com.sparta.gam.SafariPark.Person;
import com.sparta.gam.SafariPark.Vehicle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Person cathy = new Person("Cathy","French", 32);
//
//        var fullName = cathy.getFullName();
//        System.out.println(fullName);
//
//        Person laura = new Person("Laura", "Tozer", 22);
//        var laurafUllName = laura.getFullName();
//        System.out.println(laurafUllName);
//
//        var age = laura.getAge();
//        System.out.println(age);
//
//        Person parmita = new Person("parmita");
//
//        laura.setAge(35);
//        var laurasNewAge = laura.getAge();
//        System.out.println(laurasNewAge);
//
//        Hunter h = new Hunter();
//        Hunter h1 = new Hunter("Marion", "Jones", 32, "Leica");
//        System.out.println(h1.getFullName());
//        System.out.println(h1.shoot());
//
//        Hunter h3 = new Hunter("Marion", "Jones", 32, "Leica");
//        var same = h1.equals(h3);
//        var h1Hashcode = h1.hashCode();
//        var h3Hashcode = h3.hashCode();
//        var type = h1.getClass();
//        System.out.println(h1.toString());

        Vehicle x = new Vehicle();
        Vehicle x1 = new Vehicle(2,40);
        Vehicle x2 = new Vehicle(4, 3, 0, 20);

        System.out.println(x2.getPosition());
        System.out.println(x2.getCapacity());
        System.out.println(x2.getNumPassengers());
        System.out.println(x2.getSpeed());
        x2.setNumPassengers(4);
        System.out.println(x2.getNumPassengers());
        System.out.println(x2.move());
        System.out.println(x2.move(5));
        System.out.println(x2.toString());


    }
}

package com.sparta.gam;

import com.sparta.gam.SafariPark.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Person cathy = new Person("Cathy","French", 32);

        var fullName = cathy.getFullName();
        System.out.println(fullName);

        Person laura = new Person("Laura", "Tozer", 22);
        var laurafUllName = laura.getFullName();
        System.out.println(laurafUllName);

        var age = laura.getAge();
        System.out.println(age);

        Person parmita = new Person("parmita");

        laura.setAge(35);
        var laurasNewAge = laura.getAge();
        System.out.println(laurasNewAge);

    }
}

package com.sparta.gam;

import java.time.DayOfWeek;

public class EnumExample {



    //CONSTANTS
//    public static final int MONDAY = 0;
//    public static final int TUESDAY = 1;
//    public static final int WEDNESDAY = 2;
//    public static final int THURSDAY = 3;
//    public static final int FRIDAY = 4;
//    public static final int SATURDAY = 5;
//    public static final int SUNDAY = 6;
    public static void main(String[] args) {
//        int dayOfWeek; //for constants
//        dayOfWeek = SATURDAY;
        DayIndex dayOfWeek;
        dayOfWeek = DayIndex.THURSDAY;


        if (dayOfWeek == DayIndex.SATURDAY || dayOfWeek == DayIndex.SUNDAY){
            System.out.println("It's the weekend");
        } else {
            System.out.println("It's a weekday");
        }

        Size chosenSize = Size.SMALL;
        System.out.println("Size: " + chosenSize.getPizzaSize());
        System.out.println("Calories: " +chosenSize.getPizzaCalories());
        System.out.println("Energy: " + chosenSize.getEnergyInJoules() + " Joules");

        System.out.println(chosenSize.ordinal());
        //DOING THE SAME THING
        System.out.println("Energy of a medium pizza: " + Size.MEDIUM.getEnergyInJoules());
        System.out.println("Energy of a medium pizza: " + Size.valueOf("MEDIUM").getEnergyInJoules());


    }
}
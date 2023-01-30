package com.sparta.gam;

public class FizzBuzz {
    public static String fizzBuzz(int n) {
        //return n + "";
        //return String.valueOf(n);
        //return Integer.toString(n);
        if (n % 15 == 0){
            return "FizzBuzz";
        }
        if (n % 3 == 0) {
            return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";
        } else return n + "";


    }
}

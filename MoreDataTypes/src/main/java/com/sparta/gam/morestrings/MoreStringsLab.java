package com.sparta.gam.morestrings;

public class MoreStringsLab {
    // manipulates and returns a string - see the unit test for requirements
    public static String manipulateString(String input, int num)
    {
        if (input == null){
            input = "";
        }
        input = input.trim().toUpperCase();
        StringBuilder sentence = new StringBuilder(input);
        for (int i =0; i < num; i++){
            sentence.append(i);
        }
        return sentence.toString();
    }

    // returns a formatted address string given its components
    public static String address(int number, String street, String city, String postcode)
    {
        String num = "" + number;
        var address = String.join(" ", num, street, city, postcode);
        return address + ".";
    }
    // returns a string representing a test score, written as percentage to 1 decimal place
    public static String scorer(int score, int outOf)
    {
        double percentage = (double) score / outOf * 100.0;
        String sentence = String.format("You got %d out of %d: %.1f%%", score, outOf, percentage);
        return sentence;
//        Object[] sentence = {"You got ", score, " out of ", outOf, ": ", percentage, "%"};
//        StringBuilder result = new StringBuilder();
//        for (Object o : sentence){
//            result.append(o);
//        }
//        return result.toString();
    }
}

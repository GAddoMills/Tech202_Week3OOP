package com.sparta.gam.morestrings;

public class MoreStringsApp {
    public static void main(String[] args) {
        String s1 = "Hello"; //created in the String pool - special area of the heap
        String s2 = new String("Hello"); //constructed on the heap

        boolean s1_s2 = s1 == s2; //FALSE
        String s3 = s2.intern(); // CHECKS INSIDE THE POOL
        boolean s1_s3 = s1 == s3; //TRUE

        System.out.println(s1.hashCode() + " " + s2.hashCode() +" " + s3.hashCode());

        //String manipulation
        String myString = "  Java list fundamentals ";
        var result = myString.trim().toUpperCase().replace('L', '*').replace('T', '*').substring(0,13);
        //five new string are now in the pool,  everytime a string method is called, a new string is added to the pool
        //between line 14 to line 16, there are six new string added

        //StringBuilder and StringBuffer (multithreadead) classes

        //concatenating strings
        System.out.println(makeDashedString(100));

        System.out.println();
        //concatenating strings - with string builder
        System.out.println(makeDashedStringWithStringBuilder(100));

        //another way to join strings - opposite of the split() method
        String joinedNames = String.join(", ", "Cathy", "Laura", "Nish", "Ashta", "Niel");
        //output would be "Cathy, Laura, Nish,..." etc
        var splitNames = joinedNames.split(" ");

        String rejoinedNames = String.join("*", splitNames);

        //formatting strings
        long popWorldLong = 7_900_000_000L;
        System.out.println("There are " + popWorldLong + " people in the world");
        System.out.printf("There are %d people in the world", popWorldLong); //print formatting
        //formatted string
        String formattedString = String.format("There are %d people in the world", popWorldLong);

        double pi = 3.14159;

        System.out.printf("Pi  - %f \n" , pi);
        System.out.printf("Pi to 2 decimal places - %.2f \n", pi);
        System.out.printf("Pi to 4 decimal places - %.4f \n", pi);

        System.out.printf("Money in the bank - %09.2f%n \n", 34.916);
    }

    public static String makeDashedString(int length){
        String str = "";
        for (int i =1; i <= length; i++){
            str += "-";
        }
        return str;
    }

    public static String makeDashedStringWithStringBuilder(int length) {
        StringBuilder sb =new StringBuilder("");
        for (int i =1; i <= length; i++){
            sb.append('-');
        }
        return sb.toString();//type stringbuilder cant be return but string can
    }
}

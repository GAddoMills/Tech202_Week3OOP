package com.sparta.gam.primitivetypes;

public class PrimitiveApp {
    public static void main(String[] args) {
        //Java is a strongly types language
        //1. statically typed - a variable must be assigned a type when it is declared and it can't be changed
        //2. type safe - compiler prevents assigning a value of one type to a different type

        int x;
        //x = "My string"; //2. can't be done
        //3. memory safe - a variable cannot access memory not assigned to it

        //the var keyword
        //can use the keyword wherever the compiler can determine the type
        int anInt = 3; //explicitly typed
        var vInt = 6; //implicitly typed

        //floating point values - anything with decimal point
        float num = 111.222f; //compiler thinks its a double unless you add f at the end
        //binary number
        int b = 0b101; //value 5 with
        int h = 0xff;
        //default values always 0 and boolean is false


        float sum = 0;
        for (int i = 0; i < 100_000; i++)
        { sum += 2 / 5.0f; }
        System.out.println("2/5 added 100,000 times: " + sum);
        System.out.println("2/5 multiplied by 100,000: " + 2 / 5.0f * 100_000);

        double sum2 = 0;
        for (int i = 0; i < 100_000; i++)
        { sum2 += 2 / 5.0; }
        System.out.println("2/5 added 100,000 times: " + sum2);
        System.out.println("2/5 multiplied by 100,000: " + 2 / 5.0 * 100_000); //float and double difference in precision

        //constants has no keywords
        //const int z= 3;
        //it normally uses the kword final because it can't be changed, a giveaway for a constant is the uppercase name
        final int Z = 3;
    }

    public  static final double PI = 3.14159;
    public static final int DAYS_IN_A_WEEK = 7;
}

package com.sparta.gam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FizzBuzzTests {
    @Test
    @DisplayName("GIven one, return one as a String")
    public void givenOne_fizzBuzz_returnsOneAsString(){
        Assertions.assertEquals("1", FizzBuzz.fizzBuzz(1));
    }


    @ParameterizedTest
    @CsvSource ({
           "1, 1",
           "2, 2"
    })
    @DisplayName("Given any interger, fizzBuzz returns number as String")
    public void givenAnyInteger_fizzBuzz_returnsNumAsString(int input, String result){
        Assertions.assertEquals(result, FizzBuzz.fizzBuzz(input));
    }

    @Test
    @DisplayName("Given input three, should returns Fizz")
    public void givenThree_Return_Fizz(){
        int input = 3;
        Assertions.assertEquals("Fizz", FizzBuzz.fizzBuzz(input));
    }

    @ParameterizedTest
    @CsvSource({
            "3, Fizz",
            "12, Fizz"
    })
    @DisplayName("GIven a number divisible by Three not Five, return Fizz")
    public void givenANumberDivisibleByThreeButNotFive_Return_Fizz(int input, String expected){
        Assertions.assertEquals(expected, FizzBuzz.fizzBuzz(input));
    }

    @Test
    @DisplayName("Given the number Five, return Buzz")
    public void givenFive_Return_Buzz(){
        Assertions.assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
    }

    @ParameterizedTest
    @CsvSource({
            "20, Buzz",
            "25, Buzz"
    })
    public void givenANumberDivisibleByFiveButNotThree_Return_Buzz(int input, String expected){
        Assertions.assertEquals(expected, FizzBuzz.fizzBuzz(input));
    }

    @Test
    @DisplayName("Given number 15, return FizzBuzz")
    public void givenFifteen_Return_FizzBuzz(){
        Assertions.assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }

    @ParameterizedTest
    @CsvSource({
            "30, FizzBuzz",
            "60, FizzBuzz"
    })
    @DisplayName("Given a number divisible by 15, return FizzBuzz")
    public void givenANumberDivisibleByFifteen_Return_FizzBuzz(int input, String expected){
        Assertions.assertEquals(expected, FizzBuzz.fizzBuzz(input));
    }



}

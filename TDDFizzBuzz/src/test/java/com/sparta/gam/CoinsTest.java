package com.sparta.gam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CoinsTest {

    @Test
    @DisplayName("Given input 100, it should return Pound: 1")
    public void givenInput100_getCoins_returnsPoundOne(){
        Assertions.assertEquals("Pound: 1, 50p: 0, 20p: 0, 10p: 0, 5p: 0, 2p: 0, 1p: 0", Coins.getCoins(100));
    }

    @Test
    @DisplayName("Given input 200, it should return Pound: 2")
    public void givenInput100_getCoins_returnsPoundTwo(){
        Assertions.assertEquals("Pound: 2, 50p: 0, 20p: 0, 10p: 0, 5p: 0, 2p: 0, 1p: 0", Coins.getCoins(200));
    }

    @Test
    @DisplayName("Given input 150, it should return Pound: 1, 50p: 1")
    public void givenInput150_getCoins_returnsCorrect(){
        Assertions.assertEquals("Pound: 1, 50p: 1, 20p: 0, 10p: 0, 5p: 0, 2p: 0, 1p: 0", Coins.getCoins(150));
    }

    @Test
    @DisplayName("Given input 350, it should return Pound: 3, 50p: 1")
    public void givenInput350_getCoins_CorrectAnswer(){
        Assertions.assertEquals("Pound: 3, 50p: 1, 20p: 0, 10p: 0, 5p: 0, 2p: 0, 1p: 0", Coins.getCoins(350));
    }

    @Test
    @DisplayName("Given input 120, it should return Pound: 1, 20p: 1")
    public void givenInput120_getCoins_returnCorrect(){
        Assertions.assertEquals("Pound: 1, 50p: 0, 20p: 1, 10p: 0, 5p: 0, 2p: 0, 1p: 0", Coins.getCoins(120));
    }

    @Test
    @DisplayName("Given input 170, it should return Pound: 1, 50p: 1, 20p: 1")
    public void givenInput170_getCoins_returnsCorrect(){
        Assertions.assertEquals("Pound: 1, 50p: 1, 20p: 1, 10p: 0, 5p: 0, 2p: 0, 1p: 0", Coins.getCoins(170));
    }
}

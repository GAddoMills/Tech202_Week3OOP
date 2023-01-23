package com.sparta.gam;

public enum Size {
    //possible size of pizzas that will never change
    SMALL("Small pizza", 500), MEDIUM("Medium pizza", 620), LARGE("Large pizza", 620), EXTRALARGE("Extra large pizza", 720);

    //fields

    private final String pizzaSize;
    private final int pizzaCalories;

    //private constructor needed to assign values to those fields

    Size(String pizzaSize, int pizzaCalories){
        this.pizzaSize = pizzaSize;
        this.pizzaCalories = pizzaCalories;
    }

    //getters - cant have setters for constants

    public String getPizzaSize() {
        return pizzaSize;
    }

    public int getEnergyInJoules() {
        return (int)(pizzaCalories * 4.184);
    }

    public int getPizzaCalories() {
        return pizzaCalories;
    }
}


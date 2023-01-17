package com.sparta.gam;

public class Counter {

    protected int count;



    public Counter() {
    }



    public Counter(int initialCount) {
        count = initialCount;
    }
    public void increment() {
        count++;
    }



    public void decrement() {
        count--;
    }



    public void setCount(int value) {
        count = value;
    }



    public void outputCount() {
        System.out.println(count);
    }



}

package com.sparta.I;

public class AdamPeaty implements Competitor, Swimmer{
    @Override
    public void compete() {
        System.out.println("Adam Peaty started competing");
    }

    @Override
    public void swim() {
        System.out.println("Adam Peaty started swimming");
    }


}


//public class AdamPeaty implements Competitor, Swimmer{
//    @Override
//    public void compete() {
//        System.out.println("Adam Peaty started competing");
//    }
//
//    @Override
//    public void swim() {
//        System.out.println("Adam Peaty started swimming");
//    }
//}
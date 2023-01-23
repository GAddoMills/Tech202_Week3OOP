package com.sparta.I;

public class JessEnnis implements Heptathlete, Competitor{
    @Override
    public void compete() {
        System.out.println("Jess Ennis started competing");
    }

    /**
     * Comment the below out and implement Pentathlete rather than Athlete
     * Also fix the Athlete interface by commenting out other methods
     */

    @Override
    public void highJump() {
        System.out.println("Jess Ennis does the high jump");
    }

    @Override
    public void longJump() {
        System.out.println("Jess Ennis does the long jump");
    }
}



//public class JessEnnis implements Competitor, Pentathlete{
//    @Override
//    public void compete() {
//        System.out.println("Jess Ennis started competing");
//    }
//
//    /**
//     * Comment the below out and implement Pentathlete rather than Athlete
//     * Also fix the Athlete interface by commenting out other methods
//     */
//
//    @Override
//    public void highJump() {
//        System.out.println("Jess Ennis does the high jump");
//    }
//
//    @Override
//    public void longJump() {
//        System.out.println("Jess Ennis does the long jump");
//    }
//}

package com.sparta.gam;

public class Coins {
    public static String getCoins(int priceInPence){
        String answer = "";
//        int findPounds = 0;
//        int pences = 0;
//        int fiftyP = 0;
//        int twentyP = 0;
//        int tenP = 0;
//        int twoP = 0;
//        int oneP = 0;

//        if (priceInPence % 100 == 0){
//            findPounds = priceInPence / 100;
//            answer = String.format("Pound: %d", findPounds);
//        } else {
//            findPounds = priceInPence / 100;
//            pences = priceInPence % 100;
//            if (pences % 50 == 0){
//                fiftyP = pences / 50;
//                answer = String.format("Pound: %d, 50p: %d", findPounds, fiftyP);
//            }else if (pences % 20 == 0){
//                twentyP = pences / 20;
//                answer = String.format("Pound: %d, 20p: %d", findPounds, twentyP);
//            } else {
//                fiftyP = pences / 50;
//                twentyP = (pences - (fiftyP  * 50)) / 20;
//                answer = String.format("Pound: %d, 50p: %d, 20p: %d", findPounds, fiftyP, twentyP);
//            }
//
//        }

        int onePound = priceInPence/100;
        priceInPence -= onePound*100;
        int fiftyP = priceInPence / 50;
        priceInPence -=  fiftyP*50;
        int twentyP = priceInPence / 20;
        priceInPence -= twentyP*20;
        int tenP = priceInPence / 10;
        priceInPence -= tenP * 10;
        int fiveP = priceInPence / 5;
        priceInPence -= fiveP * 5;
        int twoP = priceInPence / 2;
        priceInPence -= twoP*2;

        return String.format("Pound: %d, 50p: %d, 20p: %d, 10p: %d, 5p: %d, 2p: %d, 1p: %d", onePound, fiftyP, twentyP, tenP, fiveP, twoP, priceInPence);



//        return answer;
    }
}

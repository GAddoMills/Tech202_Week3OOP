package com.sparta.gam;

import java.util.*;

public class Lab {
    public static HashSet<Integer> makeFiveSet (int max){
        HashSet<Integer> divisibleByFive = new HashSet<>();

        for (int i = 1; i <= max; i++){
            if(i % 5 == 0){
                divisibleByFive.add(i);
            }
        }

        return divisibleByFive;
    }

    public static List<String> longWordList(String phrase){
        ArrayList<String> arrayResult = new ArrayList<>();

        String[] test = phrase.split(" ");

        for (String t : test){
            if(t.length() >= 5){
                arrayResult.add(t);
            }
        }
        return arrayResult;

    }

//    public static HashMap<Integer, String> phraseToHashMap(String phrase){
//        HashMap<Integer, String> result = new HashMap<>();
//        int key = 1;
//
//        String[] stringToArray = phrase.split(" ");
//        for (String t : stringToArray){
//            result.put(key,t);
//            key++;
//        }
//
//        return result;
//    }

    public static HashMap<Integer, String> exerciseThree(String phrase){
        phrase = phrase.trim().toLowerCase();
        HashMap<Character, Integer> resultHashMap = new HashMap<>();



    }
}

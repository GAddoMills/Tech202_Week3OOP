package com.sparta.gam;

import com.sparta.gam.SafariPark.Person;

import java.util.*;

public class CollectionsApp {
    public static void main(String[] args) {

        String[] names = {"Amy", "Bilal", "Nish", "Dan"};
        double[] weights = {22.0,51.5};
        Person[] trainees = {
                new Person("Amy", "Andrews", 22),
                new Person("Bilal", "Builder", 41),
                new Person("Nish", "Mandal", 34),
                new Person("Dan", "Dare", 56),
        };

        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        for (double d : weights){
            System.out.println(d);
        }

        for (Person p : trainees){
            System.out.println(p);
        }
        System.out.println("ArrayList");

        //arraylist
        ArrayList<String> nameList = new ArrayList<>();
        int size = nameList.size();
        nameList.add("Amy");
        nameList.add("Bilal");
        nameList.add(1, "Cathy");
        int finalSize = nameList.size();

        var traineeList = new ArrayList<Person>();
        traineeList.add(new Person("Amy", "Andrews", 35));

        ArrayList<Double> weightList = new ArrayList<Double>();
        //outboxing
        weightList.add(22.0);
        weightList.add(3.7);
        //auto unboxing
        double result = weightList.get(1);

        //arraylist from an array
        var immutableTraineeList = Arrays.asList(trainees);
        //immutableTraineeList.add(new Person("Cathy", "French", 22));

        var itTraineesList2 = new ArrayList<Person>(List.of(new Person("Cathy", "French", 22), new Person(), new Person()));

        //itTraineesList2.addAll(Collections.singleton(new Person()));


        //EXERCISE
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 1; i <= 5; i++){
            newList.add(i);
        }

        newList.add(2,7);
        Collections.reverse(newList);
        newList.remove(1);
        System.out.println(newList);


        //SET is an UNORDERE COLLECTION, NO DUPLICATES ALLLOWED
        //A SET CONTAINS A GIVEN ELEMENT OR IT DOESNT
        //IT DOESNT HAVE NO INDEX OR KEY TO RETRIEVE ELEMENTS
        System.out.println("HashSet");

        var personSet = new HashSet<Person>();

        personSet.add(new Person("Amy", "Andrews", 22));
        personSet.add(new Person("Bilal", "Builder", 41));
        personSet.add(new Person("Nish", "Mandal", 34));
        personSet.add(new Person("Dan", "Dare", 56));

        System.out.println(personSet);
        //to search if it contains it you have it simulating creating a person
        //checking if the person exist
        var cathyIn = personSet.contains(new Person("Cathy", "French", 22));

        personSet.add(new Person("Bilal", "Builder", 41));

        //removing something that isn't in a set
        personSet.remove(new Person("Amy", "Andrews", 15));

        //hashMap
        System.out.println("Hash Map");
        var personMap = new HashMap<String, Person>();
        personMap.put("helen", new Person("helen", "fielding", 5));
        var s = new Person("Sherlock", "Holmes", 20);
        personMap.put("sherlock", s);
        var p = personMap.get("sherlock");
        var nobody = personMap.get("cathy");

        var olfHelen = personMap.put("helen", s);
        personMap.put("anotherHoles", s);

        var keys = personMap.keySet();
        var values = personMap.values();
        var kvPairs = personMap.entrySet();

        System.out.println(keys);
        System.out.println(values);
        System.out.println(kvPairs);

        String input = "The cat in the hat comes back";
        input = input.trim().toLowerCase();
        var countMap = new HashMap<Character, Integer>();
        for (char c : input.toCharArray())
        {
            if (countMap.containsKey(c))
            {
                var currentCount = countMap.get(c);
                countMap.put(c, currentCount + 1);
            }
            else
            {
                countMap.put(c, 1);
            }
        }
        System.out.println("Map problem");
        for (var entry : countMap.entrySet())
        {
            System.out.println(entry);
        }
        System.out.println();
        System.out.println(countMap.entrySet());


    }
}

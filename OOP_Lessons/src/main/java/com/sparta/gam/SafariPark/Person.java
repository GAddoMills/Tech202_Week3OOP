package com.sparta.gam.SafariPark;

public class Person {
    private String firstName = "";
    private String lastName = "";
    private int age;

    public Person(String firstName, String lastName, int age){
        //useless as it there by default
        //assign the parameters to the previous
        this.firstName = firstName;
        this.lastName = lastName;
        setAge(age);
    }

    public Person(String firstName){
        this.firstName = firstName;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0){
            this.age = age;
        }
    }

    public Person(){}

//    @Override
//    public String toString() {
//        return
//                "firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", age=" + age;
//    }
}

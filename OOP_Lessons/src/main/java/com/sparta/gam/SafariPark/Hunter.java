package com.sparta.gam.SafariPark;

public class Hunter extends Person{

    private String camera;
    public Hunter(){}

    public Hunter(String firstName, String lastName, int age, String camera) {
        super(firstName, lastName, age);
        this.camera = camera;
    }

    public String shoot(){
        return getFullName() + " has taken a photo with their " + camera;
    }

//    @Override
//    public String toString() {
//        return "Hunter{" +
//                "camera='" + camera + '\'' +
//                '}' + super.toString();
//    }
}

package com.sparta.S;

/**
 * Violates S of SOLID
 */

public class Student {
    private String name;
    private String course;

    public Student(String name, String course){
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    public void printDetails(){
        System.out.println(this.toString());
    }
    public void calculateGradePercentage(){
        // functionality of the method
    }
}

/**
 * Abides by S of SOLID
 * This class might be responsible for providing info for communicating with a database where Student details are
 * stored.
 */

//public class Student {
//    private String name;
//    private String course;
//
//    public Student(String name, String course){
//        this.name = name;
//        this.course = course;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getCourse() {
//        return course;
//    }
//
//    public void setCourse(String course) {
//        this.course = course;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", course='" + course + '\'' +
//                '}';
//    }
//}

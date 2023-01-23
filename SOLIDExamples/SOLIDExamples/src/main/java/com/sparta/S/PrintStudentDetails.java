package com.sparta.S;

/**
 * Key idea here is that this class is responsible for the formatting or the details to be printed.
 * We don't want a class to be responsible for the database communication and the formatting.
 */

public class PrintStudentDetails {
    public static void printDetails(Student student) {
        System.out.println(student.toString());
    }
}

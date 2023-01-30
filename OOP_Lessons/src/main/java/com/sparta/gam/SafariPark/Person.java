package com.sparta.gam.SafariPark;


import java.util.Objects;

public class Person implements IMoveable, Comparable<Person> {
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

    @Override
    public String toString() {
        return
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age;
    }

    @Override
    public String move() {
        return getFullName() + " is moving";
    }

    @Override
    public String move(int times) {
        return getFullName() + " is moving" + times + " times";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && firstName.equals(person.firstName) && lastName.equals(person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }


    @Override
    public int compareTo(Person o) {
        if (o == null) return 1;

        if (this.getFullName() != o.getFullName()) {
            return this.getFullName().compareTo(o.getFullName());
        }
        else
        {
            return ((Integer)this.getAge()).compareTo((Integer)o.getAge());
        }
    }

}

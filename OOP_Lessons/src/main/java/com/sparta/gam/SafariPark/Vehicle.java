package com.sparta.gam.SafariPark;

public class Vehicle implements IMoveable{
    private int speed = 10;
    private int position;
    private int numPassengers;
    private int capacity = 4;

    public Vehicle(){}

    public Vehicle(int capacity, int speed){
        this.capacity = capacity;
        this.speed = speed;
    }

    public Vehicle(int capacity, int numPassengers, int position, int speed){
        this.capacity = capacity;
        this.numPassengers = numPassengers;
        this.position = position;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPosition() {
        return position;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public void setNumPassengers(int numPassengers) {
        if (numPassengers <= capacity && numPassengers >= 0){
            this.numPassengers = numPassengers;
        }
    }

    public String move(){
        position = position + speed; //or multiplication??
        return "Moving along";
    }

    public String move(int times){
        position = position + (times * speed);
        return "Moving along " + times + " times";
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", position=" + position +
                ", numPassengers=" + numPassengers +
                ", capacity=" + capacity +
                '}';
    }
}

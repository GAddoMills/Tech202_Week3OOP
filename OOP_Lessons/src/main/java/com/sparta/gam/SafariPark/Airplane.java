package com.sparta.gam.SafariPark;

public class Airplane extends Vehicle{
    private int altitude = 0;
    private String airline = "";

    public int getAltitude() {
        return altitude;
    }

    public String getAirline() {
        return airline;
    }

    public Airplane(int capacity, int speed, String airline){
        super(capacity,speed);
        this.airline = airline;
    }

    public void ascend(int distance){
        altitude = altitude + distance;
    }

    public void descend(int distance){
        if (altitude >= distance){
            altitude = altitude - distance;
        }
    }

    @Override
    public String move() {
        return super.move() + " at an altitude of " + altitude + " metres";
    }

    @Override
    public String move(int times) {
        return super.move(times) + " at an altitude of " + altitude + " metres";
    }

    @Override
    public String toString() {
        return super.toString() +
                "Airplane{" +
                "altitude=" + altitude +
                ", airline='" + airline + '\'' +
                '}';
    }


}

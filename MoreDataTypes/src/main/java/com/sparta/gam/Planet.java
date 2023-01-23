package com.sparta.gam;

public enum Planet {
    MERCURY("Mercury", 35_000_000.0, 3.302E23),
    VENUS("Venus", 67_000_000.0, 4.868E24),
    EARTH("Earth", 93_000_000.0, 5.973E24),
    MARS("Mars", 142_000_000.0, 6.418E23),
    JUPITER("Jupiter", 484_000_000.0, 1.898E27),
    SATURN("Saturn", 889_000_000.0, 5.684E25),
    URANUS("Uranus", 1_790_000_000.0, 8.681E25),
    NEPTUNE("Neptune", 2_880_000_000.0, 10.243E25);

    private final String planetName;
    private final double distanceFromSun;
    private final double mass;

    Planet(String planetName, double distanceFromSun, double mass){
        this.planetName = planetName;
        this.distanceFromSun = distanceFromSun;
        this.mass = mass;
    }

    public String getPlanetName() {
        return planetName;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public double getMass() {
        return mass;
    }
}

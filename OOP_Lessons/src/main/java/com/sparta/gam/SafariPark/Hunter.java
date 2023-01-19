package com.sparta.gam.SafariPark;

public class Hunter extends Person implements IShootable{
    private IShootable shootable;

    public IShootable getShootable() {
        return shootable;
    }

    public void setShootable(IShootable shootable) {
        this.shootable = shootable;
    }

    public Hunter(){}



    public Hunter(String firstName, String lastName, int age, IShootable shootable) {
        super(firstName, lastName, age);
        this.shootable = shootable;
    }

    public String shoot(){
        return getFullName() + " is " + shootable.shoot();
                //getFullName() + " is taking a picture with a " + camera;
    }

    @Override
    public String toString() {
        return "Hunter{" +
                "shootable=" + shootable +
                '}';
    }
}

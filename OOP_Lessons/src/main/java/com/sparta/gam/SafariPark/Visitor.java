package com.sparta.gam.SafariPark;

public class Visitor extends Person implements IFeedable{

    private IFeedable feedable;

    public IFeedable getFeedable() {
        return feedable;
    }

    public void setFeedable(IFeedable feedable) {
        this.feedable = feedable;
    }

    public Visitor(String firstName, String lastName, int age){
        super(firstName, lastName, age);
    }

    public Visitor(String firstName, String lastName, int age, IFeedable feedable){
        super(firstName, lastName, age);
        this.feedable = feedable;
    }



    @Override
    public String feed() {
        return getFullName() + " is " + feedable.feed();
    }

}

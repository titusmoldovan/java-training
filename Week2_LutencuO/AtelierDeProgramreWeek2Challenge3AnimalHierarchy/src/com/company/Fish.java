package com.company;

public class Fish extends Animal implements Pet {
    protected Fish() {
        super(0);
    }

    @Override
    public void eat() {
        System.out.println("The fish eats algae");
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {
        System.out.println("This fish hasn't name.");
    }

    @Override
    public void play() {
        System.out.println("The fish cann't play.");
    }

    @Override
    public void walk() {
        System.out.println("The fish hasn't lags and it cann't walk.");
    }
}

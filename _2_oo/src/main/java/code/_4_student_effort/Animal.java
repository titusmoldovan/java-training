package com.company;

abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public abstract void eat();

    public void walk() {
        System.out.println("This animal with " + this.legs + " legs is walking very fast right now!");
    }
}

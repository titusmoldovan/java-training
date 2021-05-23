package com.company;

class Fish extends Animal {
    protected Fish() {
        super(0);
    }

    @Override
    public void eat() {
        System.out.println("The fish eats plants");
    }

    @Override
    public void walk() {
        System.out.println("Fish can't walk and don't have legs");
    }
}
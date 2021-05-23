package com.company;

public class Cat extends Animal implements Pet {
    private String name;

    protected Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat() {
        this("");
    }

    @Override
    public void eat() {
        System.out.println("The cat eats mouse.");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("The cat like play with ball.");
    }
}

package com.company;
/*
* Author: Lutencu Octavian
* Task: AnumalHierarchy
* */
public class TestAnimals {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Cat cat = new Cat("Fluffy");
        Animal animal1 = new Fish();
        Animal animal2 = new Spider();
        Pet pet = new Cat();

        //
        fish.eat();
        fish.getName();
        fish.play();
        fish.walk();
        fish.setName("Nemo");

        //
        cat.eat();
        cat.getName();
        cat.setName("Tom");
        cat.walk();
        cat.play();

        // Polimorphism
        animal1.eat();
        animal1.walk();

        //Polimorphism
        animal2.walk();
        animal2.eat();

        //
        pet.getName();
        pet.play();
        pet.setName("Mimi");

        Fish fish1 = (Fish) animal1;
        Spider spider1 = (Spider) animal2;
        Cat cat1 = (Cat) pet;
    }
}

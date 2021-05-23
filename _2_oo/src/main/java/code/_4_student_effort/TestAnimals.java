package com.company;

public class TestAnimals {

    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.walk();
        d.eat();

        System.out.println("Our cat's name is " + c.getName());
        c.eat();
        c.walk();
        c.play();

        a.eat();
        a.walk();

        e.eat();
        e.walk();

        p.setName("Pufi");
        System.out.println("Our cat's name is " + p.getName());
        ((Cat) p).eat();
        ((Cat) p).walk();
        p.play();
    }
}

package code._4_student_effort;

abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public void walk() {
        System.out.println("Number of legs is " + legs);
    }

    public abstract void eat();
}

class Spider extends Animal {
    protected Spider() {
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("Spider eats insects");
    }
}

interface Pet {
    String getName();

    void setName(String name);

    void play();
}

class Cat extends Animal implements Pet {
    private String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat() {
        this("");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Cats play with toys");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats mice");
    }
}

class Fish extends Animal {
    public Fish() {
        super(0);
    }

    @Override
    public void walk() {
        System.out.println("Fish cannot walk because it has " + legs + " legs");
    }

    @Override
    public void eat() {
        System.out.println("Fish eats seeds");
    }
}

public class ThirdChallenge {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        Animal animalCat = new Cat();
        ((Cat) animalCat).play();


        d.eat();
        d.walk();

        c.eat();

        a.walk();

        p.play();
        p.setName("Luna");
        System.out.println(p.getName());

        try {
            Cat cat = (Cat) a;
        } catch (ClassCastException exception) {
            System.out.println("Tried to cast fish to cat!!");
        }


    }
}

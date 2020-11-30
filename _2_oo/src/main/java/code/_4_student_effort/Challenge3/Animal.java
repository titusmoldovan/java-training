package code._4_student_effort.Challenge3;

abstract class Animal {

    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    abstract void eat();
    public void walk(){
        System.out.println("I'm walking on " + legs + " legs!");
    }
}

class Spider extends Animal {
    public Spider() {
        super(8);
    }

    @Override
    void eat() {
        System.out.println("I'm eating bugs!");
    }
}

interface Pet{
    void setName(String name);
    String getName();
    void play();
}

class Cat extends Animal implements Pet{
    public String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat(){
        this(" ");
    }

    @Override
    void eat() {
        System.out.println("I'm eating fish and mice!");
    }

    @Override
    public void play() {
        System.out.println("Haha, I'm playing with my cat toys!");
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        System.out.println(name);
        return name;
    }
}

class Fish extends Animal{
    public Fish() {
        super(0);
    }

    public void walk() {
        System.out.println("I can't walk, I can only swim!");
    }

    @Override
    void eat() {
        System.out.println("I'm eating smaller fish and other things from the sea!");
    }
}

class TestAnimal{
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Black");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.eat();
        d.walk();
        System.out.println(d.legs);

        System.out.println(c.legs);
        System.out.println(c.name);
        c.eat();
        c.setName("Kitten");
        c.getName();
        c.play();
        c.walk();

        System.out.println(a.legs);
        a.eat();
        a.walk();
        
        e.walk();
        e.eat();
        System.out.println(e.legs);

        p.setName("Johnny");
        p.getName();
        p.play();

    }
}


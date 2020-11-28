package code._4_student_effort.animal;

public class TestAnimals {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.walk();
        System.out.println(c.getName());
        c.eat();
        a.walk();
        ((Fish)a).play();
        e.walk();
        p.play();

    }
}

package code._4_student_effort.challenge3_AnimalHierarchy;

public class TestAnimals {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();
        p.play();
        System.out.println(d.legs);
        System.out.println(c.getName());
        a.walk();
        e.eat();
        c.eat();
    }
}

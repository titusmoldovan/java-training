package code._4_student_effort.challenge_3;


public class TestAnimals {

    public static void main(String[] args) {

        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.walk();
        c.walk();;
        a.walk();
        e.walk();

        p.play();
        d.play();
    }
}

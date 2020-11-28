package _4_student_effort;

public class TestAnimals {
    public static void main(String[] args) {
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Fish d = new Fish();
        Pet p  = new Cat();

        d.play();
        d.walk();
        c.eat();
        System.out.println(" Cat's name "+c.getName());
        c.play();
        p.getName();
        p.play();
        ((Spider)e).eat();
        a.eat();
        ((Fish)a).play();

    }


}

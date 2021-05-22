package code._4_student_effort;

public class TestAnimals {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();
        p.setName("Kitty");
        System.out.println(p.getName());
        a.walks();
        e.eat();
        c.play();
        d.eat();
        System.out.println(c.getName());
    }
}

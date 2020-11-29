package code._4_student_effort.ChallengeThree;

public class TestAnimals {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        Pet f = c;
        System.out.println(f);
        System.out.println(c);

        Animal g = c;
        System.out.println(g);
        System.out.println(c);


        System.out.println(a.legs);
        System.out.println(g.legs);

        f.play();
        System.out.println(f.getName());
        f.setName("Tom");
        System.out.println(f.getName());

        d.eat();
        d.walk();

        System.out.println(c.getName());
        c.eat();
        c.play();
        c.walk();
        c.getName();
        c.setName("Tom");

        a.eat();
        a.walk();

        e.eat();
        e.walk();

        p.play();

    }
}

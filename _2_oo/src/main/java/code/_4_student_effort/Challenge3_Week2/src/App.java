public class App {
    public static void main(String[] args) {

        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        System.out.println("~~~~~~");
        d.eat();
        d.walk();

        System.out.println("~~~~~~");
        c.eat();
        System.out.println(c.getName());


        System.out.println("~~~~~~");
        a.eat();
        a.walk();

        System.out.println("~~~~~~");
        e.walk();
        e.eat();

        System.out.println("~~~~~~");
        p.play();
        System.out.println(p.getName());
        p.setName("gica");
        System.out.println(p.getName());

        System.out.println("~~~~~~~~~~~~");
         //d = (Cat) d; inconvertible types
        //a = (Cat) a;
       // a.eat(); //doesn't work, "class Fish cannot be cast to class Cat (Fish and Cat are in unnamed module of loader 'app')"
        e = (Animal) e;
        e.walk(); // "This animal with 8 legs is walking", same print as before cast
        // c = (Animal) c; incompatible types

        System.out.println("~~~~~~~~~~~~");
        //polymorphism
        c.walk(); // "This animal with 4 legs is walking"
        e.walk(); // "This animal with 8 legs is walking"

    }
}

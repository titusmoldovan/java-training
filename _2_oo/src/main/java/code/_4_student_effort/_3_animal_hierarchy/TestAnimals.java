package code._4_student_effort._3_animal_hierarchy;


public class TestAnimals {

    public static void main(String[] args) {
        Fish fish = new Fish();
        Cat cat = new Cat("Fluffy");
        Animal animal = new Fish();
        Pet p = new Cat();

        fish.eat();
        cat.play();
        animal.walk();
        p.play();
        System.out.println(1);
    }
}

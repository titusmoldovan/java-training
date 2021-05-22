public class main {
    public static void main(String args[]) {
        System.out.println("Acesta este un program despre animale. Urmatoarele animale sunt disponibile: ");
        Fish fish = new Fish("Garry");
        Cat cat = new Cat("Misty");
        Animal animal1 = new Fish("Bob");
        Animal animal2 = new Spider();
        Pet pet = new Cat();

        //Fish
        System.out.println("Pestele" + fish.getName());
        fish.eat();
        fish.play();
        fish.walk();

        //Cat
        System.out.println("Pisica " + cat.getName());
        cat.eat();
        cat.play();
        cat.walk();
        //Animal 1 (fish)
        animal1.eat();
        animal1.walk();
        //System.out.println(animal1.legs);

        //Animal 2 (spider)
        animal2.eat();
        animal2.walk();
        //System.out.println(animal2.legs);

        //Pet (cat)
        pet.setName("Garfield");
        pet.getName();
        pet.play();
    }
}

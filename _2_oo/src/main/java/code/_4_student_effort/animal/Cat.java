package code._4_student_effort.animal;

public class Cat extends Animal implements Pet {
    String name;

    public Cat(String n){
        super(4);
        name = n;
    }

    public Cat() {
        this("");
    }

    @Override
    void eat() {
        System.out.println("Eats cat food.");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String n) {
        name = n;
    }

    @Override
    public void play() {
        System.out.println("Cat is playing.");
    }
}

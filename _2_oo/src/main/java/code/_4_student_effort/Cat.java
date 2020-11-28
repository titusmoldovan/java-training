package _4_student_effort;

public class Cat extends Animal implements Pet {
     String name;

    public Cat(String nume)    {
        super(4);
        name = nume;

    }
    public Cat(){
        this(" ");
    }

    public void eat(){
        System.out.println("The cat eats fish");

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String nume) {
        this.name = nume;
    }

    @Override
    public void play() {
        System.out.println("Cat is playing with a toy mouse.");
    }
}

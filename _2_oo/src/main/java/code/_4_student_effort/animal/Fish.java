package code._4_student_effort.animal;

public class Fish extends Animal implements Pet{
    String name;

    public Fish(){
        super(0);
    }

    @Override
    void eat() {
        System.out.println("Eats fish food.");
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
        System.out.println("Fish is playing.");
    }

    @Override
    public void walk() {
        System.out.println("Fish can't walk and don't have legs.");
    }
}

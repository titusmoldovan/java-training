package code._4_student_effort.AnimalHierarchy;

public class Fish extends Animal implements Pet{
    public Fish() {
        super(0);
    }

    @Override
    public void walk() {
        System.out.println("The fish can't walk");
    }

    @Override
    public void eat() {
        System.out.println("The fish eats");
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void play() {
        System.out.println("The fish swims in water");
    }

}

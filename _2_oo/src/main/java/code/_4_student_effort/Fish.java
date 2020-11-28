package _4_student_effort;

public class Fish extends Animal implements Pet {
    public String name;

    public Fish(){
        super(0);
    }

    void eat(){
        System.out.println("Fish eats algae");
    }

    @Override
    void walk() {
        System.out.println("Fish are swimming");
    }

    @Override
    public void play() {
        System.out.println("Fish are playing with another fish");
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

package code._4_student_effort.challenge3_AnimalHierarchy;

public class Fish extends Animal implements Pet{
    private String name;

    public Fish() {
        super(0);
    }
    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void play() {
        System.out.println("Pestele se joaca!");
    }
    @Override
    public void eat() {
        System.out.println("Pestele mananca!");
    }
    @Override
    public void walk() {
        System.out.println("Pestele inoata , nu merge !");
    }
}

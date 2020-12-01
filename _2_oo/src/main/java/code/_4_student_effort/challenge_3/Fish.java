package code._4_student_effort.challenge_3;

public class Fish extends  Animal implements Pet {

    private String name;

    protected Fish() {
        super(0);
    }

    @Override
    public void eat() {
        System.out.println("Fish eats worms");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void play() {
        System.out.println("Fish is playing");
    }

    @Override
    public void walk() {
        System.out.println("Fish can't walk");
    }
}

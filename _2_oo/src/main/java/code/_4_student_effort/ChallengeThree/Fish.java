package code._4_student_effort.ChallengeThree;

public class Fish extends Animal{
    protected Fish() {
        super(0);
    }

    @Override
    public void eat() {
        System.out.println("Fishes eat what they found");

    }

    @Override
    public void walk() {
        System.out.println("Fishes can't walk");
    }
}

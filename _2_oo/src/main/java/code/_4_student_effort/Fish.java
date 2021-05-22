package code._4_student_effort;

public class Fish extends Animal{
    public Fish() {
        super(0);
    }

    @Override
    void eat() {
        System.out.println("Fish is eating");
    }

    @Override
    void walks() {
        System.out.println("Fish can't walk!");
    }
}

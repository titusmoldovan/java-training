package code._4_student_effort;

public class Spider extends Animal {

    public Spider() {
        super(8);
    }

    @Override
    void eat() {
        System.out.println("Spider eats");
    }

    @Override
    void walks() {
        System.out.println("Spider walks");
    }
}

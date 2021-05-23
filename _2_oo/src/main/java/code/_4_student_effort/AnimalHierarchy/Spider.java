package code._4_student_effort.AnimalHierarchy;

public class Spider extends Animal{
    public Spider(Integer legs) {
        super(legs);
    }

    @Override
    public void eat() {
        System.out.println("The spider eats");
    }
}

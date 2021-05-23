package code._4_student_effort._3_animal_hierarchy;

public class Spider extends Animal {


    public Spider(Integer legs) {
        super(legs);
    }

    @Override
    public void eat() {
        System.out.println("I eat tiny insects");
    }
}

package code._4_student_effort._3_animal_hierarchy;

public class Fish extends Animal implements Pet {

    private String name;

    public Fish() {
    }

    public Fish(Integer legs) {
        super(legs);
    }

    public Fish(Integer legs, String name) {

        super(legs);
        this.name = name;
    }

    @Override
    public void walk() {
        System.out.println("Can't walk, don't have legs");
    }

    @Override
    public void eat() {
        System.out.println("I eat other fish");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("I play with others fish in the water");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + name + '\'' +
                '}';
    }
}

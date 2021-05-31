package code._4_student_effort._3_animal_hierarchy;

public class Cat extends Animal implements Pet {

    private String name;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(Integer legs, String name) {
        super(4);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("I eat milk");
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
        System.out.println("I play with my paws");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}

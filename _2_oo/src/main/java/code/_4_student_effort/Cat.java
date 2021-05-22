package code._4_student_effort;

public class Cat extends Animal implements Pet {
    private String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat() {
        this("");
    }

    @Override
    void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    void walks() {
        System.out.println("Cat walks");
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void play() {
        System.out.println("Cat is playing");
    }
}

package code._4_student_effort;

public abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }
    abstract void eat();
    abstract void walks();
}

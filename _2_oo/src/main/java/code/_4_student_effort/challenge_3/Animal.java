package code._4_student_effort.challenge_3;

public abstract class Animal {

    protected Integer legs;

    protected Animal(Integer legs) {
        this.legs = legs;
    }

    public abstract void eat();

    public void walk() {
        System.out.println("Animal with " + legs + " legs is walking");
    }
}

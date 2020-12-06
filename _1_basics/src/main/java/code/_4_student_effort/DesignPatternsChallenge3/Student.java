package code._4_student_effort.DesignPatternsChallenge3;

public class Student {
    String name;
    int money;

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    @Override
    public String toString() {
        return "Stundent {name = '" + name + "', money = " + money + "}";
    }
}

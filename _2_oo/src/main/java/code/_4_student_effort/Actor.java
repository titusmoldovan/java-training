package code._4_student_effort;

import java.util.ArrayList;

public class Actor {
    private String name;
    private int age;
    private ArrayList<Premiu> premii;

    Actor(String name, int age, ArrayList<Premiu> premii) {
        this.name = name;
        this.age = age;
        if (premii == null) {
            this.premii = new ArrayList<>();
        } else {
            this.premii = premii;
        }
    }

    public void addPremiu(Premiu premiu) {
        this.premii.add(premiu);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Premiu> getPremii() {
        return premii;
    }
}

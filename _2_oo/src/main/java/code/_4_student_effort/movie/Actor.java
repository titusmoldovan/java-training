package code._4_student_effort.movie;


public class Actor {
    private String name;
    private int age;
    private Prize[] prizes;

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

    public Prize[] getPrizes() {
        return prizes;
    }

    public void setPrizes(Prize[] prizes) {
        this.prizes = prizes;
    }

    public Actor(String n, int a, Prize[] p){
        name = n;
        age = a;
        prizes = p;
    }
}

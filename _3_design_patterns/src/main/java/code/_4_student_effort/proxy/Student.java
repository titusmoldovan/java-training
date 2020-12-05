package code._4_student_effort.proxy;

public class Student {
    private final String name;
    private int money;

    public Student(String name, int money){
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString(){
        return "Student{name='" + name + "', money=" + money + "}";
    }
}

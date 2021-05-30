package code._4_student_effort._3_proxy;

public class Student {
    private final String name;
    private final int money;
    public Student(String name, int money){
        this.name=name;
        this.money=money;
    }
    public String getName(){
        return this.name;
    }
    public int getMoney(){
        return this.money;
    }
    @Override
    public String toString(){
        return "Student{name="+this.name+", money="+this.money+"}";
    }

}

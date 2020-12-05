package code._4_student_effort.observer;

public class Student implements Observer{
    private final String name;

    public Student(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void listenTo(Teacher teacher) {
        teacher.register(this);
    }

    @Override
    public void update(String message) {
        System.out.println("Student " + name + " learned about " + message);
    }
}

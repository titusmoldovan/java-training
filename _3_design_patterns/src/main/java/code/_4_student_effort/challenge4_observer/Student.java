package code._4_student_effort.challenge4_observer;

public class Student implements Observer {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Student " + name + " learned about " + message);
    }

    public void listenTo(Teacher teacher) {
        teacher.register(this);
    }
}

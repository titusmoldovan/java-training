package code._4_student_effort.ChallengeFour;

public class Student implements Observer {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(this.name + " learned about " + message);

    }

    public void listenTo(Teacher teacher) {
        teacher.register(this);
    }

    public String getName() {
        return name;
    }
}

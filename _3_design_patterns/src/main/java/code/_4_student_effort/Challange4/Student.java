package code._4_student_effort.Challange4;

public class Student implements Observer{
    private String name;
    private String subjectLearned;
    public Student(String name)
    {
        this.name = name;
    }
    public void update(String message)
    {
        this.subjectLearned = message;
        System.out.println("Student " + name + " learned about " + subjectLearned);
    }
    public void listenTo(ObservedSubject teacher)
    {
        teacher.register(this);
    }
}

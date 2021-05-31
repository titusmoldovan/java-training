package code._4_student_effort._4_observer;

public class Main {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student s1 = new Student("Popescu");
        Student s2 = new Student("Ionescu");
        Student s3 = new Student("Dragomirescu");

        s1.listenTo(teacher);
        s2.listenTo(teacher);
        s3.listenTo(teacher);
        String[] javaTopics = new String[]{
                "basics", "oo", "design patterns"
        };
        for (String topic : javaTopics) {
            teacher.teach(topic);
        }
    }
}

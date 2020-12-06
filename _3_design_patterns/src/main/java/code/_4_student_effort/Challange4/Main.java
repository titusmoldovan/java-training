package code._4_student_effort.Challange4;

public class Main {
    public static void main (String args[])
    {
        Teacher teacher = new Teacher();
        Student s01 = new Student("Popescu");
        Student s02 = new Student("Ionescu");
        Student s03 = new Student("Dragomirescu");

        s01.listenTo(teacher);
        s02.listenTo(teacher);
        s03.listenTo(teacher);

        String[] JavaTopics = new String[]{"basics", "OO", "DesignPatterns"};
        for(int i = 0 ; i < JavaTopics.length; i++)
            teacher.teach(JavaTopics[i]);
    }
}

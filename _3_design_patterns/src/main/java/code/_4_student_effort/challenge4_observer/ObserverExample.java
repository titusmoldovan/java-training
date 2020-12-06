package code._4_student_effort.challenge4_observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverExample {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student s01 = new Student("Popescu");
        Student s02 = new Student("Ionescu");
        Student s03 = new Student("Dragomirescu");

        s01.listenTo(teacher);
        s02.listenTo(teacher);
        s03.listenTo(teacher);

        List<String> javaTopics = new ArrayList<>();
        javaTopics.add("basics");
        javaTopics.add("oo");
        javaTopics.add("design patterns");

        javaTopics.forEach(topic -> teacher.notifyObservers(topic));

    }
}

package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;

class Teacher implements ObservedSubject {
    private String topic;
    private List<Observer> observers = new ArrayList<>();

    public void teach(String topic) {
        this.topic = topic;
        notifyObservers(" ");
    }

    public String getTopic() {
        return topic;
    }

    @Override
    public void register(Observer obj) {
        observers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}

class StudentObserver implements Observer {
    private String name;
    private Teacher teacherObj = new Teacher();

    public StudentObserver(String name) {
        this.name = name;
    }

    public void listenTo(Teacher tch) {
        teacherObj = tch;
    }

    @Override
    public void update(String message) {
        message = "Student " + name + " learned about " + teacherObj.getTopic() ;
        System.out.println(message);
    }
}

interface ObservedSubject {
    void register(Observer obj);

    void unregister(Observer obj);

    void notifyObservers(String message);
}

interface Observer {
    void update(String message);
}

public class Challenge_4 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        StudentObserver s01 = new StudentObserver("Popescu");
        StudentObserver s02 = new StudentObserver("Ionescu");
        StudentObserver s03 = new StudentObserver("Dragomirescu");

        teacher.register(s01);
        teacher.register(s02);
        teacher.register(s03);

        s01.listenTo(teacher);
        s02.listenTo(teacher);
        s03.listenTo(teacher);

        String[] javaTopics = new String[]{
                "basics",
                "oo",
                "design patterns"
        };
        for (int i = 0; i < javaTopics.length; i++) {
            teacher.teach(javaTopics[i]);
        }
    }
}

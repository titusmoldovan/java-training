package code._4_student_effort._4_observer;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements ObservedSubject {
    List<Observer> students = new ArrayList<>();

    public void teach(String topic) {
        for (Observer observer : students) {
            observer.update(topic);
        }
    }

    @Override
    public void register(Observer observer) {
        students.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        students.removeIf(observer::equals);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : students) {
            observer.update(message);
        }
    }
}

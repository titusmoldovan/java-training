package code._4_student_effort.observer;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements ObservedSubject{
    private List<Observer> observers;

    public Teacher() {
        observers = new ArrayList<>();
    }

    public void teach(String javaTopic) {
        this.notifyObservers(javaTopic);
    }

    @Override
    public void register(Observer object) {
        observers.add(object);
    }

    @Override
    public void unregister(Observer object) {
        observers.remove(object);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer: observers)
            observer.update(message);
    }
}

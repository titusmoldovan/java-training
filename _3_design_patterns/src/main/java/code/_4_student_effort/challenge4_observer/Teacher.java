package code._4_student_effort.challenge4_observer;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements ObservedSubject {

    private List<Observer> observers=new ArrayList<>();

    @Override
    public void register(Observer obj) {
        observers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        observers.removeIf(observer -> observer.equals(obj));
    }

    @Override
    public void notifyObservers(String message) {
        observers.forEach(observer -> observer.update(message));
    }

}

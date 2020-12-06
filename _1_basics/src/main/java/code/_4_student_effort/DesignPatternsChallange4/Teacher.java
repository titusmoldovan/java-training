package code._4_student_effort.DesignPatternsChallange4;

import java.util.ArrayList;

public class Teacher implements ObservedSubject {
    public ArrayList<Observer> observers = new ArrayList<>();

    public Teacher() {
    }

    public void teach(String javaTopic) {
        this.notifyObservers((javaTopic));
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

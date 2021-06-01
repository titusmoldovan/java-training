package code._4_student_effort._4_observer;

public interface ObservedSubject {

    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObservers(String message);
}
package code._4_student_effort.observer;

public interface ObservedSubject {
    void register(Observer object);
    void unregister(Observer object);
    void notifyObservers(String message);
}

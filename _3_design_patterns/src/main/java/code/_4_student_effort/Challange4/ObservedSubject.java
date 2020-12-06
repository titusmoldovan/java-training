package code._4_student_effort.Challange4;

public interface ObservedSubject {
    void register(Observer obj);
    void unregister(Observer obj);
    void notifyObservers(String message);
}

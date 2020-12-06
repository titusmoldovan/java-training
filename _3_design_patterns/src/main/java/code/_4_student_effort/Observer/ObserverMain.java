package code._4_student_effort.Observer;

import java.util.ArrayList;

// Interface ObservedSubject ( Teacher ) //
interface ObservedSubject{
    void register(Observer obj);
    void unregister(Observer obj);
    void notifyObservers(String message);
}

// Interface Observer ( Student ) //
interface Observer{
    void update(String message);
}

// Teacher class //
class Teacher implements ObservedSubject{
    ArrayList<Observer> list = new ArrayList<>();


    @Override
    public void register(Observer obj) {
        list.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        list.remove(obj);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : list){
            observer.update(message);
        }
    }

    public void teach(String message){
        for (Observer observer : list) {
            observer.update(message);
        }
    }
}

// Student class //
class Student implements Observer{
    public String name;

    public Student(String name) {
        this.name = name;
    }

    public void listenTo(Teacher teacher){
        teacher.register(this);
    }

    @Override
    public void update(String message) {
        System.out.println(this.name + " learned about " + message);
    }
}

// Lecture class example //
public class ObserverMain {
    public static void main(String[] args) {

        Teacher teacher = new Teacher();
        Student s01 = new Student("Popescu");
        Student s02 = new Student("Ionescu");
        Student s03 = new Student("Dragomirescu");

        s01.listenTo(teacher);
        s02.listenTo(teacher);
        s03.listenTo(teacher);

        String[] javaTopics = new String[]{
                "basics", "oo", "design patterns"
        };

        for (String javaTopic : javaTopics) {
            teacher.teach(javaTopic);
        }

    }
}

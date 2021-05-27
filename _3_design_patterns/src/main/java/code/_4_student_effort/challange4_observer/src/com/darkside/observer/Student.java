package com.darkside.observer;

public class Student implements Observer {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void listenTo(Teacher teacher) {
        teacher.register(this);
    }

    @Override
    public void update(String message) {
        System.out.println("Student " + name + " learned about " + message);
    }
}
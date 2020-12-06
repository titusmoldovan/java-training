package code._4_student_effort.Challange4;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Teacher implements ObservedSubject {

    private Observer[] students = new Observer[50];
    private int nrOfStudents;
    private String subject;

    public Teacher()
    {
        nrOfStudents = 0;
    }
    public void register(Observer obj)
    {
        students[nrOfStudents++] = obj;
    }

    public void unregister(Observer obj)
    {
        for(int i = 0; i < nrOfStudents; i++)
        {
            if(students[i].equals(obj))
            {
                for(int j = i + 1; j < nrOfStudents; j++)
                    students[j - 1] = students[j];
                nrOfStudents--;
            }
        }
    }

    public void teach(String subject)
    {
        this.subject = subject;
        notifyObservers(subject);
    }
    public void notifyObservers(String message)
    {
        for(int i = 0; i < nrOfStudents; i++)
            students[i].update(message);
    }
}

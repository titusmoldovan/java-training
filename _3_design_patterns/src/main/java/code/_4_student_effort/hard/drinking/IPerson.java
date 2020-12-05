package code._4_student_effort.hard.drinking;


public interface IPerson {
    String getName();
    void walk();
    @LogExecutionTime
    void drink() throws InterruptedException;
}

package code._4_student_effort.hard.drinking;

public class Main {
    public static void main(String[] args) {
        IPerson person = new Person.Builder().setName("Duke").build();
        person.walk();
        try {
            person.drink();
        }
        catch (Exception ignored){}
    }
}

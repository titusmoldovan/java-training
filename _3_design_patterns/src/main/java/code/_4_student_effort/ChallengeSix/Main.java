package code._4_student_effort.ChallengeSix;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder("Jack").setUniversity("POLITEHNICA").build();
        System.out.println(person);
    }
}

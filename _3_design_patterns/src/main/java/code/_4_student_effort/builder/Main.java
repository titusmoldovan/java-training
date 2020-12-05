package code._4_student_effort.builder;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder("Ana").build();
        System.out.println(person);
        System.out.println();

        person = new Person.Builder("Ana").setJob("a job").setUniversity("a university").setMarried(true).build();
        System.out.println(person);
    }
}

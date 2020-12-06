package code._4_student_effort.DesignPatternsChallenge6;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person.Builder("Sam").build();
        System.out.println(person1);

        Person person2 = new Person.Builder("Egor").job("accounting assistant").university("FEAA, Iasi").drivingLicense(true).isMaried(false).build();
        System.out.println(person2);
    }
}

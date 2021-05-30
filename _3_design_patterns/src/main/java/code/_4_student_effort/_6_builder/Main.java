package code._4_student_effort._6_builder;

public class Main {
    public static void main(String[] args) {
        Person person1=new Person.Builder("Alina").hasJob("programmer").setUniversity("Computer science").setDrivingLicence("B").isPersonMarried(false).build();
        System.out.println(person1.toString());
    }
}

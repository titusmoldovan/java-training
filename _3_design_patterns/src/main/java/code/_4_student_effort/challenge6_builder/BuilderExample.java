package code._4_student_effort.challenge6_builder;

public class BuilderExample {

    public static void main(String[] args) {

        Person person = new Person.Builder("Andreea")
                .setJob("developer")
                .setMarried(false)
                .build();

        Person person2 = new Person.Builder("Mihai")
                .setJob("doctor")
                .setMarried(true)
                .setDrivingLicense("B2")
                .build();

    }
}

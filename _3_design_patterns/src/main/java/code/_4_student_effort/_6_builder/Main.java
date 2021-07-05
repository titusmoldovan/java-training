package code._4_student_effort._6_builder;

public class Main {

    public static void main(String[] args) {
        Person Mihai = new Person.Builder("Mihai")
                .withDrivingLicense("B")
                .withJob("Software engineer")
                .withUniversity("UTCN")
                .isMarried(true).build();

        System.out.println(Mihai);
    }
}

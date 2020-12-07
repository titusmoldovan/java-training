package code._4_student_effort.Challange6;

public class Main {
    public static void main(String args[])
    {
        Person p1 = new Person.Builder("Presecan").make();
        System.out.println(p1.getName() + " " + p1.getDrivingLicence() + " " + p1.getJob() + " " + p1.getIsMarried() + " " + p1.getUniversity());
        Person p2 = new Person.Builder("Paltineanu").withDrivingLicence("B2").make();
        System.out.println(p2.getName() + " " + p2.getDrivingLicence() + " " + p2.getJob() + " " + p2.getIsMarried() + " " + p2.getUniversity());
        Person p3 = new Person.Builder("Ionescu").withDrivingLicence("B2").withJob("Judecator").withIsMarried(true).withUniversity("UTCN").make();
        System.out.println(p3.getName() + " " + p3.getDrivingLicence() + " " + p3.getJob() + " " + p3.getIsMarried() + " " + p3.getUniversity());
    }
}

package code._4_student_effort.DesignPatternsChallenge3;

public class Main {
    public static void main(String[] args) {
        Apartment apartment01 = new Apartment("Crangasi01", 300);
        Apartment apartment02 = new Apartment("Crangasi01", 600);
        Apartment apartment03 = new Apartment("Crangasi01", 350);
        Apartment apartment04 = new Apartment("Crangasi01", 400);
        Apartment apartment05 = new Apartment("Crangasi01", 200);

        RealEstateAgentProxy proxy = new RealEstateAgentProxy();
        proxy.represent(apartment01);
        proxy.represent(apartment02);
        proxy.represent(apartment03);
        proxy.represent(apartment04);
        proxy.represent(apartment05);

        Student student01 = new Student("Ionescu", 500);
        Student student02 = new Student("Popescu", 330);

        Apartment apartmentForStudent01 = proxy.rent(student01);
        System.out.println(student01 + " rented " + apartmentForStudent01);
        Apartment apartmentForStudent02 = proxy.rent(student02);
        System.out.println(student02 + " rented " + apartmentForStudent02);
    }
}

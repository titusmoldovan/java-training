package code._4_student_effort.proxy;

public class Main {
    public static void main(String[] args) {
        Apartment apartment1 = new Apartment("Crangasi01", 300);
        Apartment apartment2 = new Apartment("Crangasi01", 600);
        Apartment apartment3 = new Apartment("Crangasi01", 350);
        Apartment apartment4 = new Apartment("Crangasi01", 400);
        Apartment apartment5 = new Apartment("Crangasi01", 200);

        RealEstateAgentProxy proxy = new RealEstateAgentProxy();
        proxy.represent(apartment1);
        proxy.represent(apartment2);
        proxy.represent(apartment3);
        proxy.represent(apartment4);
        proxy.represent(apartment5);

        Student student1 = new Student("Ionescu", 500);
        Student student2 = new Student("Popescu", 330);

        Apartment apartmentForStudent1 = proxy.rent(student1);
        System.out.println(student1 + " rented " + apartmentForStudent1);
        Apartment apartmentForStudent2 = proxy.rent(student2);
        System.out.println(student2 + " rented " + apartmentForStudent2);
    }
}

package code._4_student_effort._3_proxy;

public class Main {

    public static void main(String[] args) {

        Apartment ap1 = new Apartment("Crangasi01", 300);
        Apartment ap2 = new Apartment("Crangasi01", 600);
        Apartment ap3 = new Apartment("Crangasi01", 350);
        Apartment ap4 = new Apartment("Crangasi01", 400);
        Apartment ap5 = new Apartment("Crangasi01", 200);

        RealEstateProxyImplementation proxy = new RealEstateProxyImplementation();

        proxy.represent(ap1);
        proxy.represent(ap2);
        proxy.represent(ap3);
        proxy.represent(ap4);
        proxy.represent(ap5);
        proxy.getRentedApartments().forEach(System.out::println);
        Student student1 = new Student("Ionescu", 500);
        Student student2 = new Student("Popescu", 330);
        System.out.println(student1.getName() + " " + "rented: " + proxy.rent(student1));
        System.out.println(student2.getName() + " " + "rented: " + proxy.rent(student2));
        proxy.getRentedApartments().forEach(System.out::println);

    }
}

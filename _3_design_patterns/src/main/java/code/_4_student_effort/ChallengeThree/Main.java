package code._4_student_effort.ChallengeThree;

public class Main {

    private static final RealEstateAgentProxy proxy = new RealEstateAgentProxy();
    private static final Student student01 = new Student("Ionescu", 500);
    private static final Student student02 = new Student("Popescu", 330);

    public static void main(String[] args) {

        System.out.println(proxy.getApartments());
        Apartment apartamentForStudent01 = proxy.rent(student01);
        System.out.println(student01 + " rented " + apartamentForStudent01);
        Apartment apartamentForStudent02 = proxy.rent(student02);
        System.out.println(student02 + " rented " + apartamentForStudent02);
        System.out.println(proxy.getApartments());

    }

    static {

        Apartment app01 = new Apartment("Crangasi01", 300);
        Apartment app02 = new Apartment("Crangasi01", 600);
        Apartment app03 = new Apartment("Crangasi01", 350);
        Apartment app04 = new Apartment("Crangasi01", 400);
        Apartment app05 = new Apartment("Crangasi01", 200);

        proxy.represent(app01);
        proxy.represent(app02);
        proxy.represent(app03);
        proxy.represent(app04);
        proxy.represent(app05);

    }
}

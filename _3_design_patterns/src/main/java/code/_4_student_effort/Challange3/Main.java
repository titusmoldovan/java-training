package code._4_student_effort.Challange3;

public class Main {
    public static void main(String args[])
    {
        Appartment ap1 = new Appartment("Crangasi01",300);
        Appartment ap2 = new Appartment("Crangasi02",600);
        Appartment ap3 = new Appartment("Crangasi03",1245);
        Appartment ap4 = new Appartment("Crangasi04",243);
        Appartment ap5 = new Appartment("Crangasi05",432);

        RealEstateAgentProxy proxy = new RealEstateAgentProxy();
        proxy.represent(ap1);
        proxy.represent(ap2);
        proxy.represent(ap3);
        proxy.represent(ap4);
        proxy.represent(ap5);

        Student student1 = new Student("Ionescu", 500);
        Student student2 = new Student("Popescu", 600);

        Appartment rentedAppartment1 = proxy.rent(student1);
        Appartment rentedAppartment2 = proxy.rent(student2);
        System.out.println(student1.getName() + " rented " + rentedAppartment1.getLocation());
        System.out.println(student2.getName() + " rented " + rentedAppartment2);


    }
}

package code._4_student_effort.Proxy;

class Apartment{
    public String location;
    public Integer monthlyRentCost;

    @Override
    public String toString() {
        return "Apartment{" +
                "location='" + location + '\'' +
                ", monthlyRentCost=" + monthlyRentCost +
                '}';
    }

    public Apartment(String location, Integer monthlyRentCost) {
        this.location = location;
        this.monthlyRentCost = monthlyRentCost;
    }
}

class Student{
    public String name;
    public Integer money;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }
}

class RealEstateAgentProxy{
    Apartment dummy = null;
    void represent(Apartment apartment){
        this.dummy = apartment;
    }
    Apartment rent(Student student){
        if(student.name.trim().startsWith("P") || student.money < dummy.monthlyRentCost){
            this.dummy = null;
        }
        return dummy;
    }
}

public class Proxy {
    public static void main(String[] args) {

        Apartment app01 = new Apartment("Crangasi01", 300);
        Apartment app02 = new Apartment("Crangasi01", 600);
        Apartment app03 = new Apartment("Crangasi01", 350);
        Apartment app04 = new Apartment("Crangasi01", 400);
        Apartment app05 = new Apartment("Crangasi01", 200);

        RealEstateAgentProxy proxy = new RealEstateAgentProxy();
        proxy.represent(app01);
        proxy.represent(app02);
        proxy.represent(app03);
        proxy.represent(app04);
        proxy.represent(app05);

        Student student01 = new Student("Ionescu", 500);
        Student student02 = new Student("Popescu", 330);

        Apartment apartmentForStudent01 = proxy.rent(student01);
        System.out.println(student01 + " rented " + apartmentForStudent01);
        Apartment apartmentForStudent02 = proxy.rent(student02);
        System.out.println(student02 + " rented " + apartmentForStudent02);

    }
}

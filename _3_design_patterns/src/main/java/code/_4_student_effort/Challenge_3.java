package code._4_student_effort;

//Proxy pattern

import java.util.ArrayList;
import java.util.List;

class Apartment {
    private String location;
    private int monthlyRentCost;

    public Apartment(String location, int monthlyRentCost) {
        this.location = location;
        this.monthlyRentCost = monthlyRentCost;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getMonthlyRentCost() {
        return monthlyRentCost;
    }

    public void setMonthlyRentCost(int monthlyRentCost) {
        this.monthlyRentCost = monthlyRentCost;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "location='" + location + '\'' +
                ", monthlyRentCost=" + monthlyRentCost +
                '}';
    }
}

class Student {
    private String name;
    private int money;

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}

interface RealEstateAgent {
    void represent(Apartment apartment);

    Apartment rent(Student student);
}

class RealEstateAgentProxy implements RealEstateAgent {

    List<Apartment> apartments = new ArrayList<>();

    @Override
    public void represent(Apartment apartment) {
        apartments.add(apartment);
    }

    @Override
    public Apartment rent(Student student) {
        if(student.getName().startsWith("P")) {
            return  null;
        }

        //get the apartment with rent less than student's money
        Apartment apartment = null;
        for(Apartment ap : apartments) {
            if(ap.getMonthlyRentCost() <= student.getMoney()) {
                apartment = ap;
                break;
            }
        }
        //remove from list if apartment is rented
        if(apartment != null) {
            apartments.remove(apartment);
        }
        return apartment;
    }
}

public class Challenge_3 {
    public static void main(String[] args) {
        Apartment app01 = new Apartment("Crangasi01", 300);
        Apartment app02 = new Apartment("Crangasi01", 600);
        Apartment app03 = new Apartment("Crangasi01", 350);
        Apartment app04 = new Apartment("Crangasi01", 400);
        Apartment app05 = new Apartment("Crangasi01", 200);

        Student student01 = new Student("Ionescu", 500);
        Student student02 = new Student("Popescu", 330);

        RealEstateAgentProxy proxy = new RealEstateAgentProxy();

        proxy.represent(app01);
        proxy.represent(app02);
        proxy.represent(app03);
        proxy.represent(app04);
        proxy.represent(app05);

        Apartment apartmentForStudent01 = proxy.rent(student01);
        Apartment apartmentForStudent02 = proxy.rent(student02);

        System.out.println(student01 + " rented " + apartmentForStudent01);
        System.out.println(student02 + " rented " + apartmentForStudent02);
    }
}



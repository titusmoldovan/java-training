package code._4_student_effort.DesignPatternsChallenge3;

import java.util.*;

public class RealEstateAgentProxy {
    List<Apartment> apartments;

    public RealEstateAgentProxy() {
        apartments = new ArrayList<>();
    }

    public void represent(Apartment apartment) {
        apartments.add(apartment);
    }

    Apartment rent(Student student) {
        Apartment rentedApartment = null;
        List<Apartment> exampleOfAppartaments = new ArrayList<>();
        int lowestRent = 0;
        if (student.name.charAt(0) != 'P') {
            for (Apartment apartment : apartments) {
                if (apartment.monthlyRentCost <= student.money) {
                    exampleOfAppartaments.add(apartment);
                    lowestRent = apartment.monthlyRentCost;
                }
            }
        }

        for (Apartment apartment : exampleOfAppartaments) {
            if (apartment.monthlyRentCost <= lowestRent) {
                rentedApartment = apartment;
            }
        }
        apartments.remove(rentedApartment);
        return rentedApartment;
    }
}


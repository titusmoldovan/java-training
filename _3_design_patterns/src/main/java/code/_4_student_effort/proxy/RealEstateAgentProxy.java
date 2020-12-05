package code._4_student_effort.proxy;


import java.util.ArrayList;
import java.util.List;

public class RealEstateAgentProxy {
    List<Apartment> apartments;

    public RealEstateAgentProxy() {
        apartments = new ArrayList<>();
    }

    public void represent(Apartment apartment) {
        apartments.add(apartment);
    }

    public Apartment rent(Student student) {
        Apartment rentedApartment = null;
        if (student.getName().charAt(0) != 'P') {
            for (Apartment apartment : apartments) {
                if (apartment.getMonthlyRentCost() <= student.getMoney()) {
                    rentedApartment = apartment;
                    apartments.remove(apartment);
                    break;
                }
            }
        }
        return rentedApartment;
    }
}

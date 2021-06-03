package code._4_student_effort._3_proxy;

import java.util.ArrayList;
import java.util.List;

public class RealEstateProxyImplementation implements RealEstateProxy {
    private final List<Apartment> rentedApartments = new ArrayList<>();

    @Override
    public void represent(Apartment apartment) {
        rentedApartments.add(apartment);
    }

    @Override
    public Apartment rent(Student student) {

        Apartment rentedAp = rentedApartments.stream()
                .filter(apartment -> apartment.getMonthlyCost() <= student.getMoney() && !student.getName().startsWith("P"))
                .findAny()
                .orElse(null);
        if (rentedAp != null) {
            rentedApartments.remove(rentedAp);
        }
        return rentedAp;
    }

    public List<Apartment> getRentedApartments() {
        return rentedApartments;
    }
}

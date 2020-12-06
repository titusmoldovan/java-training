package code._4_student_effort.challenge3_proxy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class RealEstateAgentProxy {

    private List<Apartment> apartments = new ArrayList<>();

    public void represent(Apartment apartment) {
        apartments.add(apartment);
    }

    public Apartment rent(Student student) {

        if (!student.getName().startsWith("P")) {
            Apartment rentedApartment = apartments.stream()
                    .filter(apartment -> apartment.getMonthlyRentCost() <= student.getMoney())
                    .findFirst()
                    .get();

            if (Objects.nonNull(rentedApartment)) {
                apartments.removeIf(apartment -> apartment.equals(rentedApartment));
                return rentedApartment;
            }
        }

        return null;

    }


}

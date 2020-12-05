package code._4_student_effort.ChallengeThree;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RealEstateAgentProxy {

    private List<Apartment> apartments;

    public RealEstateAgentProxy() {
        apartments = new ArrayList<>();
    }

    public void represent(Apartment apartment) {
        apartments.add(apartment);
    }

    public Apartment rent(Student student) {
        List<Apartment> affordableAppartaments = new ArrayList<>();
        for (Apartment apartment : this.apartments) {
            if (apartment.getMonthlyRentCost() < student.getMoney()) {
                affordableAppartaments.add(apartment);
            }
        }
        if (student.getName().startsWith("P")) {
            return null;
        } else {
            Random rn = new Random();
            Apartment rentedApp = affordableAppartaments.get(rn.nextInt(this.apartments.size() - 1));
            apartments.remove(rentedApp);
            return rentedApp;
        }
    }

    public List<Apartment> getApartments() {
        return apartments;
    }
}

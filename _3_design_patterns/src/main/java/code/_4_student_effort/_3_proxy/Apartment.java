package code._4_student_effort._3_proxy;

public class Apartment {

    private String location;
    private Integer monthlyCost;

    public Apartment(String location, Integer monthlyCost) {
        this.location = location;
        this.monthlyCost = monthlyCost;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getMonthlyCost() {
        return monthlyCost;
    }

    public void setMonthlyCost(Integer monthlyCost) {
        this.monthlyCost = monthlyCost;
    }

    @Override
    public String toString() {
        return "Apartment: " +
                "location=" + location +
                ", monthlyCost=" + monthlyCost;
    }
}

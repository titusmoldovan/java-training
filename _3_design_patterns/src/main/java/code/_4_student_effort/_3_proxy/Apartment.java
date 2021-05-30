package code._4_student_effort._3_proxy;

public class Apartment {
    private final String location;
    private final int monthlyRentCost;
    public Apartment(String location,int montlyRentCost){
        this.location=location;
        this.monthlyRentCost=montlyRentCost;
    }
    public String getLocation(){
        return this.location;
    }
    public int getMonthlyRentCost(){
        return this.monthlyRentCost;
    }
    @Override
    public String toString(){
        return "Apartment{location="+this.location+", monthlyRentCost="+this.monthlyRentCost+"}";
    }
}

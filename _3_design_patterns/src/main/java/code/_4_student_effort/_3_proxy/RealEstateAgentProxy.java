package code._4_student_effort._3_proxy;

import java.util.Arrays;

public class RealEstateAgentProxy {
    private Apartment[] apartments=new Apartment[0];

    public void represent(Apartment apartment){
        this.apartments= Arrays.copyOf(this.apartments,this.apartments.length+1);
        this.apartments[this.apartments.length-1]=apartment;
    }
    public Apartment rent(Student student){
        Apartment rentedApartment = null;
        int index=0;
        if(student.getName().startsWith("P")==false){
            for(int i=0;i<apartments.length;i++){
                if(apartments[i].getMonthlyRentCost()<student.getMoney()){
                    rentedApartment=apartments[i];
                    index=i;
                    System.arraycopy(this.apartments, index + 1, this.apartments, index, this.apartments.length - 1 - index);
                    break;
                }
            }
        }
        return rentedApartment;
    }
}

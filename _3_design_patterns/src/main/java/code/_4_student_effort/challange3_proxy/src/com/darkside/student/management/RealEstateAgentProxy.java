package com.darkside.student.management;

import java.util.ArrayList;
import java.util.List;

public class RealEstateAgentProxy {
	
	private List<Apartment> apartments = new ArrayList<>(); 
	
	public void represent(Apartment apartment) {
		apartments.add(apartment);
	}
	
	 public Apartment rent(Student student) {
	        Apartment rentedApartment = null;
	        if (!student.getName().startsWith("P")) {
	        	for (int i = 0; i < apartments.size(); i++) {
	        		if (apartments.get(i).getRentCost() < student.getMoney()) {
	        			rentedApartment = apartments.get(i);
	        			apartments.remove(i);
	        			i--;
	        		}
	        	}
	        }
	        return rentedApartment;
	    }
	
}

package com.darkside.student.management;

public class Apartment {
	
	private final String location;
    private final int rentCost;

    public Apartment(String location, int rentCost) {
        this.location = location;
        this.rentCost = rentCost;
    }

    public String getLocation() {
        return location;
    }

    public int getRentCost() {
        return rentCost;
    }

	@Override
	public String toString() {
		return "Apartment [location=" + location + ", rentCost=" + rentCost + "]";
	}

}

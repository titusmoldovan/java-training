package com.tema_1;

public class RedCarDecorator extends CarDecorator{

    String colour;

    public RedCarDecorator(Marca decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public Integer getCP() {
        return decoratedCar.getCP();
    }

    @Override
    public Integer getMaxSpeed() {
        return decoratedCar.getMaxSpeed();
    }

    @Override
    public String getCompany() {
        return decoratedCar.getCompany();
    }

    @Override
    public void draw() {
        colour = setRedColour(decoratedCar);
    }

    private String setRedColour(Marca decoratedCar) {
        return "Red";
    }
}

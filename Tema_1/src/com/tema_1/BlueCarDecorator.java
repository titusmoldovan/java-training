package com.tema_1;

public class BlueCarDecorator extends CarDecorator {

    String colour;

    public BlueCarDecorator(Marca decoratedCar) {
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
        colour = setBlueColour(decoratedCar);
    }

    private String setBlueColour(Marca decoratedCar) {
        return "Blue";
    }
}

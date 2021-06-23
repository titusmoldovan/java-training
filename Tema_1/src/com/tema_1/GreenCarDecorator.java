package com.tema_1;

public class GreenCarDecorator extends CarDecorator{

    String colour;

    public GreenCarDecorator(Marca decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public Integer getCP() {
        return decoratedCar.getCP();
    }

    @Override
    public Integer getMaxVit() {
        return decoratedCar.getMaxVit();
    }

    @Override
    public String getFirma() {
        return decoratedCar.getFirma();
    }

    @Override
    public void draw() {
        colour = setGreenColour(decoratedCar);
    }

    private String setGreenColour(Marca decoratedCar) {
        return "Green";
    }
}

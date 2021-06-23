package com.tema_1;

public class BlueCarDecorator extends CarDecorator{

    public BlueCarDecorator(Marca decoratedCar) {
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
        decoratedCar.draw();
        setBlueColour(decoratedCar);
    }

    private void setBlueColour(Marca decoratedCar) {
        System.out.println("Car colour: Blue");
    }
}

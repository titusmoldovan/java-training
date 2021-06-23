package com.tema_1;

public class RedCarDecorator extends CarDecorator{

    public RedCarDecorator(Marca decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public void draw() {
        decoratedCar.draw();
        setRedColour(decoratedCar);
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

    private void setRedColour(Marca decoratedCar) {
        System.out.println("Car colour: Red");
    }
}

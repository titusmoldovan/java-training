package com.tema_1;

public abstract class CarDecorator implements Marca{
    protected Marca decoratedCar;

    public CarDecorator(Marca decoratedCar) {
        this.decoratedCar = decoratedCar;
    }
}

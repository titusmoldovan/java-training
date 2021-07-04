package com.tema_1;

public class BMW implements Marca {

    @Override
    public Integer getCP() {
        return 300;
    }

    @Override
    public Integer getMaxSpeed() {
        return 230;
    }

    @Override
    public String getCompany() {
        return "BMW";
    }

    @Override
    public void draw() {
    }
}
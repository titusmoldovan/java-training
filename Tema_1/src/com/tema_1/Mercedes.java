package com.tema_1;


public class Mercedes implements Marca {

    @Override
    public Integer getCP() {
        return 400;
    }

    @Override
    public Integer getMaxSpeed() {
        return 250;
    }

    @Override
    public String getCompany() {
        return "Mercedes";
    }

    @Override
    public void draw() {
    }
}
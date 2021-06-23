package com.tema_1;

public class BMW implements Marca {

    @Override
    public Integer getCP() {
        return 300;
    }

    @Override
    public Integer getMaxVit() {
        return 230;
    }

    @Override
    public String getFirma() {
        return "BMW";
    }

    @Override
    public void draw() {
    }
}
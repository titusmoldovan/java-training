package com.tema_1;


public class Mercedes implements Marca {

    @Override
    public Integer getCP() {
        return 400;
    }

    @Override
    public Integer getMaxVit() {
        return 250;
    }

    @Override
    public String getFirma() {
        return "Mercedes";
    }

    @Override
    public void draw() {
    }
}
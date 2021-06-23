package com.tema_1;

public class Audi implements Marca {

    @Override
    public Integer getCP() {
        return 400;
    }

    @Override
    public Integer getMaxVit() {
        return 300;
    }

    @Override
    public String getFirma() {
        return "Audi";
    }

    @Override
    public void draw() {
    }
}
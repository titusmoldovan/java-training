package com.tema_1;

public class DecoratorPattern {
    public static void main(String[] args) {

        Marca redBmw = new GreenCarDecorator(new BMW());

        Marca blueMercedes = new BlueCarDecorator(new Mercedes());

        System.out.println("\nAudi of blue colour\n");
        blueMercedes.draw();
        System.out.println(blueMercedes.getCP());
        System.out.println(blueMercedes.getFirma());
    }
}

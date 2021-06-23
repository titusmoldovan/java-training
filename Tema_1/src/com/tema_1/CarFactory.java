package com.tema_1;

public class CarFactory {
    public static Marca getCar(String type) {
        if ("Audi".equals(type)) {
            return new Audi();
        } else if ("Mercedes".equals(type)) {
            return new Mercedes();
        } else if ("BMW".equals(type)) {
            return new BMW();
        }
        return null;
    }
}

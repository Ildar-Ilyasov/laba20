package com.company;

public class Ship implements Transport {

    @Override
    public void move() {
        System.out.println("Судно плывет");
    }
}
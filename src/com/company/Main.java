package com.company;

public class Main {

    public static void main(String[] args) {
        TransportCompany transportCompany = new TransportCompany();
        Transport truck = transportCompany.createTruck();
        truck.move();
        Transport ship = transportCompany.createShip();
        ship.move();
        Transport plane = transportCompany.createPlane();
        plane.move();
    }
}
package com.company;

public class TransportCompany{
    Transport createShip(){
        return new Ship();
    }
    Transport createTruck(){
        return new Truck();
    }
    Transport createPlane(){
        return new Plane();
    }

}
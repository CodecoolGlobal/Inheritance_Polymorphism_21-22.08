package com.codecool.vehicle;

public class Car extends Vehicle {

    private int fuelLiters;

    public Car(int fuelLiters) {
        super(4);
        this.fuelLiters = fuelLiters;
    }

    public void park() {
        System.out.println("Parking car");
    }

    @Override
    public void goForward() {
        System.out.println("Turn on engine");
        if (fuelLiters >= 0) {
            super.goForward();
        } else {
            System.out.println("Can't go forward, no fuel");
        }
    }
}

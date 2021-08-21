package com.codecool.vehicle;

public class Vehicle {

    protected int wheelsNumber;

    public Vehicle(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }

    public void goForward() {
        System.out.println("Update position of vehicle");
    }

    public int getWheelsNumber() {
        return wheelsNumber;
    }
}

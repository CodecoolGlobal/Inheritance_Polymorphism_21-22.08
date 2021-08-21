package com.codecool.vehicle;

public class Bicycle extends Vehicle {

    public static final int RED = 0;
    public static final int BLUE = 1;

    private int color; // 0 -> czerwony, 1 -> niebieski
    private String name;

    public Bicycle(int color) {
        super(2);
        this.color = color;
        name = "Bicycle " + color;
    }

    public void someMethod() {
        System.out.println("Some method that can read and write from superclass that it has " + wheelsNumber + " wheels");
    }

    public void setColor(int color) {
        this.color = color;
        name = "Bicycle " + color;
    }
}

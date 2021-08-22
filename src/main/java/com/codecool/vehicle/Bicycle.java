package com.codecool.vehicle;

public class Bicycle extends Vehicle {

    private Color color;
    private String name;

    public Bicycle(Color color) {
        super(2);
        this.color = color;
        name = "Bicycle " + color;
    }

    public void someMethod() {
        System.out.println("Some method that can read and write from superclass that it has " + wheelsNumber + " wheels");
    }

    public void setColor(Color color) {
        this.color = color;
        name = "Bicycle " + color;
    }

    public Color getColor() {
        return color;
    }
}

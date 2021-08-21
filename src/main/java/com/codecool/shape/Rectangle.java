package com.codecool.shape;

public class Rectangle extends Shape {
    private double sideA;
    private double sideB;

    public Rectangle(int sideA, int sideB) {
        super(0, 0);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double area() {
        return sideA * sideB;
    }
}

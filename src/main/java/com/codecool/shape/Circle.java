package com.codecool.shape;

public class Circle extends Shape {
    public static final double PI = 3.14;
    private final double r;

    public Circle(double r, int x, int y) {
        super(x, y);
        this.r = r;
    }

    public void where() {
        System.out.println("Im in circle");
    }

    @Override
    public double area() {
        return PI * r * r;
    }
}

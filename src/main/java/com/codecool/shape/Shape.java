package com.codecool.shape;

public abstract class Shape {

    private int x;
    private int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double canShapeBeAt(int x) {
        double zmienna = area();
        return zmienna * x;
    }

    public abstract double area();

}

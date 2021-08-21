package com.codecool;

import com.codecool.shape.Circle;
import com.codecool.shape.Shape;
import com.codecool.shape.Square;
import com.codecool.vehicle.Bicycle;
import com.codecool.vehicle.Car;
import com.codecool.vehicle.RedBicycle;
import com.codecool.vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(10);
        car.goForward();
        car.park();
        System.out.println(car.getWheelsNumber());

        Vehicle vehicle = new Vehicle(3);
        System.out.println(vehicle.getWheelsNumber());

        RedBicycle redBicycle = new RedBicycle();
        redBicycle.goForward();
        redBicycle.setColor(Bicycle.BLUE);
        redBicycle.setColor(1);

//        Shape shape = new Shape();  can't be created - is abstract
//        shape.area();

        Circle circle = new Circle(2, 0, 0);
        Square square = new Square(5);
        System.out.println(circle.area());
        System.out.println(square.area());


//        System.out.println(redBicycle == redBicycle);
//        System.out.println(redBicycle.equals(bicycle2));
    }
}

package com.codecool;

import com.codecool.library.HardCoverBook;
import com.codecool.library.Library;
import com.codecool.library.SoftCoverBook;
import com.codecool.shape.Circle;
import com.codecool.shape.Shape;
import com.codecool.shape.Square;
import com.codecool.vehicle.Bicycle;
import com.codecool.vehicle.Car;
import com.codecool.vehicle.RedBicycle;
import com.codecool.vehicle.Vehicle;

import java.util.Arrays;

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

        // after break below v

        Shape shapeCircle = circle;

        Shape[] shapes = new Shape[2];

        Object circleObject = circle;

        shapes[0] = circle;
        shapes[1] = square;

        if (shapes[0] instanceof Circle) {
            Circle shapeAt1s = (Circle) shapes[0];
            shapeAt1s.where();
        } else {
            System.out.println("Not circle");
        }


        double area = shapeCircle.area();
        System.out.println(area);

        Library library = new Library(5);
        HardCoverBook hardCoverBook = new HardCoverBook(100, "Mickiewicz", "Pan Tadeusz", 1834, true);
        SoftCoverBook softCoverBook = new SoftCoverBook(200, "Henryk Sienkiewicz", "W pustyni i w puszczy", 1911);

        library.addBook(hardCoverBook);
        library.addBook(softCoverBook);

        String mickiewiczBook = hardCoverBook.toString();
        System.out.println(mickiewiczBook);

        System.out.println(Arrays.toString(library.getShelf()));




//        System.out.println(redBicycle == redBicycle);
//        System.out.println(redBicycle.equals(bicycle2));
    }
}

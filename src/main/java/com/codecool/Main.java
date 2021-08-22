package com.codecool;

import com.codecool.library.HardCoverBook;
import com.codecool.library.Library;
import com.codecool.library.SoftCoverBook;
import com.codecool.shape.Circle;
import com.codecool.shape.Shape;
import com.codecool.shape.Square;
import com.codecool.vehicle.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        introductionToInheritance();
        polymorphism();
        enums();
        arrayAndListDifference();
    }

    private static void introductionToInheritance() {
        Car car = new Car(10);
        car.goForward();
        car.park();
        System.out.println(car.getWheelsNumber());

        Vehicle vehicle = new Vehicle(3);
        System.out.println(vehicle.getWheelsNumber());

        RedBicycle redBicycle = new RedBicycle();
        redBicycle.goForward();

//        Shape shape = new Shape();  can't be created - is abstract
//        shape.area();
    }

    private static void polymorphism() {
        Circle circle = new Circle(2, 0, 0);
        Square square = new Square(5);

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
    }

    private static void enums() {
        System.out.println(Color.RED);

        RedBicycle secondRedBicycle = new RedBicycle();
        secondRedBicycle.goForward();

        Bicycle bicycle = new Bicycle(Color.BLUE);

        System.out.println(bicycle.getColor().getHexValue());
        System.out.println(secondRedBicycle.getColor().getHexValue());

        System.out.println(Color.RED == Color.RED);
        System.out.println(Color.RED == Color.BLUE);
    }

    private static void arrayAndListDifference() {
        Circle circle = new Circle(2, 0, 0);
        Square square = new Square(5);

        Shape[] shapes = new Shape[2];

        shapes[0] = circle;
        shapes[1] = square;

        ArrayList<Shape> shapesList = new ArrayList<>();
        shapesList.add(circle);
        shapesList.add(square);
        shapesList.add(square);
        shapesList.add(square);
        System.out.println(shapesList);

        Shape shape = shapesList.get(0);
        System.out.println(shapesList.size());


        Circle circle2 = new Circle(2, 0, 0);

        System.out.println(shapesList.contains(circle2));

        Shape[] shapes2 = new Shape[shapesList.size()];
        shapesList.toArray(shapes2);

        // 0
        IntegerLinkedList list = new IntegerLinkedList(0);
        // 0 -> 1
        list.addElement(1);
        // 0 -> 1 -> 2
        list.addElement(2);

        System.out.println(list);
    }
}

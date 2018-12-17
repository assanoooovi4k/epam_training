package by.epam.training.java.assanoooovi4k.triangle.controller;

import by.epam.training.java.assanoooovi4k.triangle.reader.DataReader;

import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Point point1 = new Point(2, 4);
//        Point point2 = new Point(-5, 10);
//        Point point3 = new Point(3, 5);
//
//        System.out.println(Triangle.isPointsOnLine(point1, point2, point3));
//        Triangle triangle = new Triangle(point1, point2, point3);
//        Triangle triangle1 = new Triangle(point1, point2, point3);
//        Triangle triangle2 = new Triangle(point1, point2, point3);
//        Triangle triangle3 = new Triangle(point1, point2, point3);
//
//        System.out.println(triangle + "\n" + triangle1);

        DataReader dataReader = new DataReader();
        List<String> s = dataReader.readData("resources/triangle.txt");
        System.out.println(s.toString());

    }
}

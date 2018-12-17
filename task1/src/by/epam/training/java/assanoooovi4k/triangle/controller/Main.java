package by.epam.training.java.assanoooovi4k.triangle.controller;

import by.epam.training.java.assanoooovi4k.triangle.creator.TriangleCreator;
import by.epam.training.java.assanoooovi4k.triangle.entity.Triangle;
import by.epam.training.java.assanoooovi4k.triangle.exception.DataFormatException;
import by.epam.training.java.assanoooovi4k.triangle.parser.DataParser;
import by.epam.training.java.assanoooovi4k.triangle.reader.DataReader;

import java.util.List;

public class Main {

    public static void main(String[] args) throws DataFormatException {
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

        DataParser dataParser = new DataParser();
        List<String> ss = dataParser.parseData(s);

        TriangleCreator triangleCreator = new TriangleCreator();
        List<Triangle> triangles = triangleCreator.createTriangles(ss);
        System.out.println(triangles.toString());

    }
}

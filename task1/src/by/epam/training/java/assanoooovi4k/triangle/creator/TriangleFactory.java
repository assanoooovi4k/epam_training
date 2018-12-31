package by.epam.training.java.assanoooovi4k.triangle.creator;

import by.epam.training.java.assanoooovi4k.triangle.entity.Point;
import by.epam.training.java.assanoooovi4k.triangle.entity.Triangle;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TriangleFactory {
    private TriangleFactory() {

    }

    public static List<Triangle> createTriangles (List<Point[]> points) {
        return points.stream().map(a->TriangleFactory.createTriangle(a[0],a[1],a[2]))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());
    }

    private static Optional<Triangle> createTriangle(Point point1, Point point2, Point point3) {
        Triangle triangle = new Triangle(point1, point2, point3);
        return Optional.of(triangle);
    }
}
package by.epam.training.java.assanoooovi4k.triangle.creator;

import by.epam.training.java.assanoooovi4k.triangle.entity.Point;

public class PointFactory {
    private PointFactory() {

    }

    public static Point createPoint(double x, double y) {
        return new Point(x, y);
    }
}

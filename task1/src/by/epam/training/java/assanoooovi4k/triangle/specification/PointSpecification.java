package by.epam.training.java.assanoooovi4k.triangle.specification;

import by.epam.training.java.assanoooovi4k.triangle.entity.Point;
import by.epam.training.java.assanoooovi4k.triangle.entity.Triangle;

public class PointSpecification implements TriangleSpecification {
    private Point point;

    public PointSpecification(Point point) {
        this.point = point;
    }

    @Override
    public boolean specified(Triangle triangle) {
        if (triangle == null) {
            return false;
        }

        return triangle.getPoint1().equalsPoints(point)
                || triangle.getPoint2().equalsPoints(point)
                || triangle.getPoint3().equalsPoints(point);
    }
}

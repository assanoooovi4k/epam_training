package by.epam.training.java.assanoooovi4k.model.entity;

public class Triangle {
    public static final Point DEFAULT_POINT = new Point(1, 2);

    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    private static boolean isPointsOnLine(Point point1, Point point2, Point point3) {
        return (point3.getX() - point1.getX()) / (point2.getX() - point1.getX())
                == (point3.getY() - point1.getY()) / (point2.getY() - point1.getY());

    }
}

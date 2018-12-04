package by.epam.training.java.assanoooovi4k.model.entity;

import java.util.Objects;

public class Triangle {
    public static final Point DEFAULT_POINT1 = new Point(0, 0);
    public static final Point DEFAULT_POINT2 = new Point(2, 2);
    public static final Point DEFAULT_POINT3 = new Point(5, 0);

    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle() {
        this.point1 = DEFAULT_POINT1;
        this.point2 = DEFAULT_POINT2;
        this.point3 = DEFAULT_POINT3;
    }

    public Triangle(Point point1, Point point2, Point point3) {
        if (!isPointsOnLine(point1, point2, point3)) {
            point1 = DEFAULT_POINT1;
            point2 = DEFAULT_POINT2;
            point3 = DEFAULT_POINT3;
        }

        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public void setTriangle(Point point1, Point point2, Point point3) {
        if (!isPointsOnLine(point1, point2, point3)) {
            //exception
        }

        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    private static boolean isPointsOnLine(Point point1, Point point2, Point point3) {
        return (point3.getX() - point1.getX()) / (point2.getX() - point1.getX())
                == (point3.getY() - point1.getY()) / (point2.getY() - point1.getY());

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(getPoint1(), triangle.getPoint1()) &&
                Objects.equals(getPoint2(), triangle.getPoint2()) &&
                Objects.equals(getPoint3(), triangle.getPoint3());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getPoint1(), getPoint2(), getPoint3());
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                ", point3=" + point3 +
                '}';
    }
}

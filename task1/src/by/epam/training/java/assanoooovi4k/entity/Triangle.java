package by.epam.training.java.assanoooovi4k.entity;

import by.epam.training.java.assanoooovi4k.generator.IdGenerator;

import java.util.Objects;

public class Triangle {
    private long triangleId;

    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle() {
        this.triangleId = IdGenerator.generateId();
    }

    public Triangle(Point point1, Point point2, Point point3) {
        if (isPointsOnLine(point1, point2, point3)) {
            //exception
        }

        this.triangleId = IdGenerator.generateId();
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public void setTriangle(Point point1, Point point2, Point point3) {
        if (isPointsOnLine(point1, point2, point3)) {
            //exception
        }

        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public long getTriangleId() {
        return triangleId;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        if (isPointsOnLine(point1, this.point2, this.point3)) {
            //exception
        }

        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        if (isPointsOnLine(this.point1, point2, this.point3)) {
            //exception
        }

        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        if (isPointsOnLine(this.point1, this.point2, point3)) {
            //exception
        }

        this.point3 = point3;
    }

    public static boolean isPointsOnLine(Point point1, Point point2, Point point3) {
        return (point1.getX() - point2.getX()) * (point1.getY() - point3.getY())
                == (point1.getX() - point3.getX()) * (point1.getY() - point2.getY());

    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Triangle triangle = (Triangle) obj;
        return getPoint1().equals(triangle.getPoint1()) &&
                getPoint2().equals(triangle.getPoint2()) &&
                getPoint3().equals(triangle.getPoint3());
//        return Objects.equals(getPoint1(), triangle.getPoint1()) &&
//                Objects.equals(getPoint2(), triangle.getPoint2()) &&
//                Objects.equals(getPoint3(), triangle.getPoint3());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPoint1(), getPoint2(), getPoint3());
    }

    @Override
    public String toString() {
        return "Triangle. Id: " + triangleId + ". Points: " + point1 + " " + point2 + " " + point3;
    }
}
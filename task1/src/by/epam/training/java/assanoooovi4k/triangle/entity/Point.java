package by.epam.training.java.assanoooovi4k.triangle.entity;

import by.epam.training.java.assanoooovi4k.triangle.generator.IdGenerator;

public class Point {
    private static final double DEFAULT_COORDINATE = 1;

    private long pointId;
    private double x;
    private double y;

    public Point() {
        this.pointId = IdGenerator.generateId();
        this.x = DEFAULT_COORDINATE;
        this.y = DEFAULT_COORDINATE;
    }

    public Point(double x, double y) {
        this.pointId = IdGenerator.generateId();
        this.x = x;
        this.y = y;
    }

    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public long getPointId() {
        return pointId;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


    public boolean equalsPoints(Point point) {
        if (this == point) return true;
        if (point == null) return false;

        return  (Double.compare(point.getX(), getX()) == 0 &&
                Double.compare(point.getY(), getY()) == 0);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;

        Point point = (Point) obj;
        return getPointId() == point.getPointId() &&
                Double.compare(point.getX(), getX()) == 0 &&
                Double.compare(point.getY(), getY()) == 0;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (int) getX();
        result = 31 * result + (int) getY();
        return result;
    }

    @Override
    public String toString() {
        return "(" + x + ";" + y + ")";
    }
}

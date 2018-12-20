package by.epam.training.java.assanoooovi4k.triangle.entity;

import by.epam.training.java.assanoooovi4k.triangle.exception.DataFormatException;
import by.epam.training.java.assanoooovi4k.triangle.generator.IdGenerator;

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
            try {
                throw new DataFormatException("Check your input data " + point1 + " " + point2 + " " + point3);
            } catch (DataFormatException e) {
                e.printStackTrace();
            }

            this.triangleId = IdGenerator.generateId();
        } else {
            this.triangleId = IdGenerator.generateId();
            this.point1 = point1;
            this.point2 = point2;
            this.point3 = point3;
        }
    }

    public void setTriangle(Point point1, Point point2, Point point3) {
        if (isPointsOnLine(point1, point2, point3)) {
            try {
                throw new DataFormatException("Check your input data " + point1 + " " + point2 + " " + point3);
            } catch (DataFormatException e) {
                e.printStackTrace();
            }
        } else {
            this.point1 = point1;
            this.point2 = point2;
            this.point3 = point3;
        }
    }

    public long getTriangleId() {
        return triangleId;
    }

    public void setTriangleId(long triangleId) {
        this.triangleId = triangleId;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        if (isPointsOnLine(point1, this.point2, this.point3)) {
            try {
                throw new DataFormatException("Check your input data " + point1);
            } catch (DataFormatException e) {
                e.printStackTrace();
            }
        } else {
            this.point1 = point1;
        }
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        if (isPointsOnLine(this.point1, point2, this.point3)) {
            try {
                throw new DataFormatException("Check your input data " + point2);
            } catch (DataFormatException e) {
                e.printStackTrace();
            }
        } else {
            this.point2 = point2;
        }
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        if (isPointsOnLine(this.point1, this.point2, point3)) {
            try {
                throw new DataFormatException("Check your input data " + point3);
            } catch (DataFormatException e) {
                e.printStackTrace();
            }
        } else {
            this.point3 = point3;
        }
    }

    private static boolean isPointsOnLine(Point point1, Point point2, Point point3) {
        return (point1.getX() - point2.getX()) * (point1.getY() - point3.getY())
                == (point1.getX() - point3.getX()) * (point1.getY() - point2.getY());

    }

    public boolean equalsTriangle(Triangle triangle) {
        if (this == triangle) return true;
        if (triangle == null) return false;

        return getPoint1().equalsPoints(triangle.getPoint1()) &&
                getPoint2().equalsPoints(triangle.getPoint2()) &&
                getPoint3().equalsPoints(triangle.getPoint3());
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;

        Triangle triangle = (Triangle) obj;
        return getTriangleId() == triangle.getTriangleId() &&
                getPoint1().equals(triangle.getPoint1()) &&
                getPoint2().equals(triangle.getPoint2()) &&
                getPoint3().equals(triangle.getPoint3());
    }

    @Override
    public int hashCode() {
        int result = (int) (getTriangleId() ^ (getTriangleId() >>> 32));

        result = 31 * result + getPoint1().hashCode();
        result = 31 * result + getPoint2().hashCode();
        result = 31 * result + getPoint3().hashCode();

        return result;
    }

    @Override
    public String toString() {
        return "Triangle. Id: " + triangleId + ". Points: " + point1 + " " + point2 + " " + point3;
    }
}

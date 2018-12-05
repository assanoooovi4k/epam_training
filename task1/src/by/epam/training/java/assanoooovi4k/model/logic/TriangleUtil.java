package by.epam.training.java.assanoooovi4k.model.logic;

import by.epam.training.java.assanoooovi4k.model.entity.Point;
import by.epam.training.java.assanoooovi4k.model.entity.Triangle;

public class TriangleUtil {
    public static double calculatePerimeter(Triangle triangle) {
        double[] abc = getAllSidesLength(triangle);

        return abc[0] + abc[1] + abc[2];
    }

    public static double calculateArea(Triangle triangle) {
        double[] abc = getAllSidesLength(triangle);
        double semiPer = calculatePerimeter(triangle) / 2;

        return Math.sqrt(semiPer * (semiPer - abc[0]) * (semiPer - abc[1]) * (semiPer - abc[2]));
    }

    public static boolean isRectangular(Triangle triangle) {
        double[] abc = getAllSidesLength(triangle);

        return Math.round(abc[0] * abc[0] + abc[1] * abc[1]) == Math.round(abc[2] * abc[2])
                || Math.round(abc[0] * abc[0] + abc[2] * abc[2]) == Math.round(abc[1] * abc[1])
                || Math.round(abc[2] * abc[2] + abc[1] * abc[1]) == Math.round(abc[0] * abc[0]);

    }

    public static boolean isIsosceles(Triangle triangle) {
        double[] abc = getAllSidesLength(triangle);

        return abc[0] == abc[1] || abc[1] == abc[2] || abc[0] == abc[2];

    }

    public static boolean isEquilateral(Triangle triangle) {
        double[] abc = getAllSidesLength(triangle);

        return Math.round(abc[0]) == Math.round(abc[1]) && Math.round(abc[0]) == Math.round(abc[2]);
    }

    public static boolean isAcuteAngle(Triangle triangle) {
        double[] abc = getAllSidesLength(triangle);

        if (isObtuse(triangle) || isRectangular(triangle)) {
            return false;
        }

        return (abc[0] * abc[0] + abc[1] * abc[1] > abc[2] * abc[2])
                || (abc[0] * abc[0] + abc[2] * abc[2] > abc[1] * abc[1])
                || (abc[2] * abc[2] + abc[1] * abc[1] > abc[0] * abc[0]);
    }

    public static boolean isObtuse(Triangle triangle) {
        double[] abc = getAllSidesLength(triangle);

        return (abc[0] * abc[0] + abc[1] * abc[1] < abc[2] * abc[2])
                || (abc[0] * abc[0] + abc[2] * abc[2] < abc[1] * abc[1])
                || (abc[2] * abc[2] + abc[1] * abc[1] < abc[0] * abc[0]);
    }


    private static double getSideLength(Point point1, Point point2) {
        double x1 = point1.getX();
        double y1 = point1.getY();
        double x2 = point2.getX();
        double y2 = point2.getY();

        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }

    private static double[] getAllSidesLength(Triangle triangle) {
        double[] abc = new double[3];
        abc[0] = getSideLength(triangle.getPoint1(), triangle.getPoint2());
        abc[1] = getSideLength(triangle.getPoint2(), triangle.getPoint3());
        abc[2] = getSideLength(triangle.getPoint1(), triangle.getPoint3());

        return abc;
    }
}

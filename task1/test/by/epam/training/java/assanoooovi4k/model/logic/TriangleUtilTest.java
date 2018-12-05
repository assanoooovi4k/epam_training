package by.epam.training.java.assanoooovi4k.model.logic;

import by.epam.training.java.assanoooovi4k.model.entity.Point;
import by.epam.training.java.assanoooovi4k.model.entity.Triangle;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TriangleUtilTest {
    //Random triangle
    private static final Point point1 = new Point(2, 4);
    private static final Point point2 = new Point(2, 10);
    private static final Point point3 = new Point(3, 5);
    private static final Triangle triangle = new Triangle(point1, point2, point3);

    //Rectangular, isosceles triangle
    private static final Point pointRect1 = new Point(0, 0);
    private static final Point pointRect2 = new Point(2, 0);
    private static final Point pointRect3 = new Point(0, 2);
    private static final Triangle rectTriangle = new Triangle(pointRect1, pointRect2, pointRect3);

    //Equilateral, acute-angle triangle
    private static final Point pointEquil1 = new Point(0, 0);
    private static final Point pointEquil2 = new Point(0.5, Math.sqrt(3)/2);
    private static final Point pointEquil3 = new Point(1, 0);
    private static final Triangle equilTriangle = new Triangle(pointEquil1, pointEquil2, pointEquil3);

    @Test
    public void testCalculatePerimeter() {
        double expected = 12.51;
        double actual = TriangleUtil.calculatePerimeter(triangle);
        assertEquals(actual, expected, 0.01);
    }

    @Test
    public void testCalculateArea() {
        double expected = 3;
        double actual = TriangleUtil.calculateArea(triangle);
        assertEquals(actual, expected, 0.01);
    }

    @Test
    public void testIsRectangular1() {
        boolean actual = TriangleUtil.isRectangular(triangle);
        assertFalse(actual);
    }

    @Test
    public void testIsRectangular2() {
        boolean actual = TriangleUtil.isRectangular(rectTriangle);
        assertTrue(actual);
    }

    @Test
    public void testIsIsosceles1() {
        boolean expected = false;
        boolean actual = TriangleUtil.isIsosceles(triangle);
        assertFalse(actual);
    }

    @Test
    public void testIsIsosceles2() {
        boolean actual = TriangleUtil.isIsosceles(rectTriangle);
        assertTrue(actual);
    }

    @Test
    public void testIsEquilateral1() {
        boolean actual = TriangleUtil.isEquilateral(triangle);
        assertFalse(actual);
    }

    @Test
    public void testIsEquilateral2() {
        boolean actual = TriangleUtil.isEquilateral(equilTriangle);
        assertTrue(actual);
    }


    @Test
    public void testIsAcuteAngle1() {
        boolean actual = TriangleUtil.isAcuteAngle(equilTriangle);
        assertTrue(actual);
    }

    @Test
    public void testIsAcuteAngle2() {
        boolean actual = TriangleUtil.isAcuteAngle(triangle);
        assertFalse(actual);
    }

    @Test
    public void testIsObtuse() {
        boolean actual = TriangleUtil.isObtuse(triangle);
        assertTrue(actual);
    }
}
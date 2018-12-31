package by.epam.training.java.assanoooovi4k.triangle.creator;

import by.epam.training.java.assanoooovi4k.triangle.entity.Triangle;
import by.epam.training.java.assanoooovi4k.triangle.entity.TriangleCondition;

public class TriangleConditionFactory {
    private TriangleConditionFactory() {

    }

    public static TriangleCondition createTriangleCondition(Triangle triangle) {
        return new TriangleCondition(triangle);
    }
}

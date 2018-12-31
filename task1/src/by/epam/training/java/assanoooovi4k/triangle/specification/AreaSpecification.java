package by.epam.training.java.assanoooovi4k.triangle.specification;

import by.epam.training.java.assanoooovi4k.triangle.entity.Triangle;
import by.epam.training.java.assanoooovi4k.triangle.entity.TriangleCondition;
import by.epam.training.java.assanoooovi4k.triangle.logic.TriangleCalculator;
import by.epam.training.java.assanoooovi4k.triangle.warehouse.Warehouse;

public class AreaSpecification implements TriangleSpecification {
    private double start;
    private double end;

    public AreaSpecification(double start, double end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public boolean specified(Triangle triangle) {
        if (triangle == null) {
            return false;
        }

        Warehouse warehouse = Warehouse.getInstance();
        TriangleCondition triangleCondition = warehouse.get(triangle.getTriangleId());
        double area = (triangleCondition != null)
                ? triangleCondition.getArea() : TriangleCalculator.calculateArea(triangle);
        return (area >= start && area <= end);
    }
}

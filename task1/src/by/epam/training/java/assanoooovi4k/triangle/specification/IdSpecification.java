package by.epam.training.java.assanoooovi4k.triangle.specification;

import by.epam.training.java.assanoooovi4k.triangle.entity.Triangle;

public class IdSpecification implements TriangleSpecification{
    private int specifiedId;

    public IdSpecification(int id) {
        this.specifiedId = id;
    }

    @Override
    public boolean specified(Triangle triangle) {
        if (triangle != null) {
            return triangle.getTriangleId() == specifiedId;
        }

        return false;
    }
}

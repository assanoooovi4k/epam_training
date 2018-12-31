package by.epam.training.java.assanoooovi4k.triangle.repository;

import by.epam.training.java.assanoooovi4k.triangle.creator.TriangleConditionFactory;
import by.epam.training.java.assanoooovi4k.triangle.entity.Triangle;
import by.epam.training.java.assanoooovi4k.triangle.entity.TriangleCondition;
import by.epam.training.java.assanoooovi4k.triangle.warehouse.Warehouse;

import java.util.Collection;

public class RepositoryTrianglesSaver {
    private RepositoryTrianglesSaver() {

    }

    public static void saveTriangles(Collection<Triangle> triangles) {
        if (triangles != null) {
            triangles.forEach(RepositoryTrianglesSaver::saveTriangle);
        }
    }

    public static void saveTriangle(Triangle triangle) {
        Repository repository = TriangleRepository.getInstance();
        repository.add(triangle);

        TriangleCondition triangleCondition = TriangleConditionFactory.createTriangleCondition(triangle);
        triangle.registerObserver(triangleCondition);

        Warehouse warehouse = Warehouse.getInstance();
        warehouse.add(triangle.getTriangleId(), triangleCondition);
    }
}

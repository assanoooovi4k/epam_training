package by.epam.training.java.assanoooovi4k.triangle.repository;

import by.epam.training.java.assanoooovi4k.triangle.entity.Triangle;
import by.epam.training.java.assanoooovi4k.triangle.specification.TriangleSpecification;

import java.util.List;

public interface Repository {
    void add(Triangle triangle);
    void remove(Triangle triangle);
    //void update(Triangle triangle);

    List<Triangle> query(TriangleSpecification specification);
}

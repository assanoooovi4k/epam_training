package by.epam.training.java.assanoooovi4k.triangle.parser;

import by.epam.training.java.assanoooovi4k.triangle.exception.DataFormatException;
import by.epam.training.java.assanoooovi4k.triangle.validator.DataValidator;

import java.util.ArrayList;
import java.util.List;

public class DataParser {
    public List<String> parseData(List<String> listOfTriangles) throws DataFormatException {
        List<String> parsedList = new ArrayList<>();
        DataValidator dataValidator = new DataValidator();

        for (String pointLine : listOfTriangles) {
            if (dataValidator.isValidTriangleData(pointLine)) {
                parsedList.add(pointLine);
            }
            else {
                try {
                    throw new DataFormatException("This line is incorrect: " + pointLine);
                }
                catch (DataFormatException e) {
                    e.printStackTrace();
                }
            }
        }

        return parsedList;
    }

}

package by.epam.training.java.assanoooovi4k.reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataReader {
    public List<String> readData(String filePath) {
        List<String> lines;

        try (Stream<String> stream = Files.lines(Paths.get(filePath))) {
            lines = stream.collect(Collectors.toList());
        } catch (IOException e) {
            //log fatal exception
            throw new RuntimeException("Exception", e);
        }

        return lines;
    }
}

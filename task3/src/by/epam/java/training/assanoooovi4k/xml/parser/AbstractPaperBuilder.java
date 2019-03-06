package by.epam.java.training.assanoooovi4k.xml.parser;

import by.epam.java.training.assanoooovi4k.xml.entity.Paper;
import by.epam.java.training.assanoooovi4k.xml.exception.ParserException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class AbstractPaperBuilder {
    protected List<Paper> papers;

    public AbstractPaperBuilder() {
        papers = new ArrayList<>();
    }

    public List<Paper> getPapers() {
        return papers;
    }

    abstract public void buildSetOfPapers(String name) throws ParserException;
}

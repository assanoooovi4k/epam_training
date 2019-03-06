package by.epam.java.training.assanoooovi4k.xml.parser;

import by.epam.java.training.assanoooovi4k.xml.exception.ParserException;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SaxBuilder extends AbstractPaperBuilder{
    private PaperHandler handler;

    public SaxBuilder() {
        handler = new PaperHandler();
    }

    @Override
    public void buildSetOfPapers(String name) throws ParserException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser;
        try {
            parser = factory.newSAXParser();
            parser.parse(new File(name), handler);
            papers = handler.getPapers();
        } catch (FileNotFoundException e) {
            throw new ParserException("file not found", e);
        } catch (SAXException e) {
            throw new ParserException("sax exception", e);
        } catch (IOException e) {
            throw new ParserException("io exception", e);
        } catch (ParserConfigurationException e) {
            throw new ParserException("config exception", e);
        }
    }

}

package by.epam.java.training.assanoooovi4k.xml.parser;

import by.epam.java.training.assanoooovi4k.xml.entity.*;
import by.epam.java.training.assanoooovi4k.xml.exception.ParserException;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

import static by.epam.java.training.assanoooovi4k.xml.entity.PaperType.*;

public class PaperHandler extends DefaultHandler {
    private Paper paper;
    private String qName;
    private List<Paper> papers;

    public PaperHandler() {
        papers = new ArrayList<>();
    }

    public List<Paper> getPapers() {
        return papers;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        this.qName = qName;

        if (this.qName.equals(PaperType.JOURNAL.getValue())) {
            paper = new Journal();
        }
        if (this.qName.equals(PaperType.NEWSPAPER.getValue())) {
            paper = new Newspaper();
        }
        if (this.qName.equals(PaperType.BOOKLET.getValue())) {
            paper = new Booklet();
        }

        for (int index = 0; index < attributes.getLength(); index++) {
            String attribute = attributes.getLocalName(index);
            String value = attributes.getValue(index);

            try {
                buildAttributes(attribute, value);
            } catch (ParserException e) {
                //LOGGER.log(Level.WARN, e);
            }
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) {
        String value = new String(ch, start, length).trim();

        if (qName != null) {
            if (qName.equals(MONTHLY.getValue())) {
                paper.setMonthly(Boolean.parseBoolean(value));
            } else if (qName.equals(COLORED.getValue())) {
                paper.setColored(Boolean.parseBoolean(value));
            } else if (qName.equals(VOLUME.getValue())) {
                //paper.setVolume(Integer.parseInt(value));
            } else if (qName.equals(GLOSSY.getValue())) {
                paper.setGlossy(Boolean.parseBoolean(value));
                System.out.println(value);
            } else if (qName.equals(NAME_OF_COMPANY.getValue())) {
                ((Booklet) paper).setNameOfCompany(value);
            } else if (qName.equals(BOOKLET_TYPE.getValue())) {
//                ((Booklet) paper).setBookletTypeValue(value);
            } else if (qName.equals(SUBSCRIPTION_INDEX.getValue())) {
                if (paper.isGlossy()) {
                    ((Journal) paper).setSubscriptionIndex(Integer.parseInt(value));
                }
                else {
//                ((Newspaper) paper).setSubscriptionIndex(Integer.parseInt(value));
                }
            } else if (qName.equals(JOURNAL_TYPE.getValue())) {
//                ((Journal) paper).setJournalTypeValue(value);
            } else if (qName.equals(NEWSPAPER_TYPE.getValue())) {
//                ((Newspaper) paper).setNewspaperTypeValue(value);
            }
        }

    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        if (qName.equals(PaperType.JOURNAL.getValue()) || qName.equals(PaperType.BOOKLET.getValue()) ||
                qName.equals(PaperType.NEWSPAPER.getValue())) {
            papers.add(paper);
        }
    }

    private void buildAttributes(String attribute, String value) throws ParserException {
        if (attribute.equals(ID.getValue())) {
            paper.setId(Long.parseLong(value));
        } else if (attribute.equals(TITLE.getValue())) {
            paper.setTitle(value);
        } else {
            throw new ParserException("Unknown attribute");
        }
    }
}

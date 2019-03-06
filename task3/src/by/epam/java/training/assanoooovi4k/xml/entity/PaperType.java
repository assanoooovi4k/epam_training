package by.epam.java.training.assanoooovi4k.xml.entity;

public enum PaperType {
    JOURNAL("journal"), NEWSPAPER("newspaper"), BOOKLET("booklet"),
    ID("id"),
    TITLE("title"),
    MONTHLY("monthly"),
    COLORED("colored"),
    VOLUME("volume"),
    GLOSSY("glossy"),
    NAME_OF_COMPANY("name-of-company"),
    BOOKLET_TYPE("booklet-type"),
    SUBSCRIPTION_INDEX("subscription-index"),
    JOURNAL_TYPE("journal-type"),
    NEWSPAPER_TYPE("newspaper-type");

    private String value;

    PaperType(String value) {
        this.value = value;
    }


    public String getValue() {
        return value;
    }
}

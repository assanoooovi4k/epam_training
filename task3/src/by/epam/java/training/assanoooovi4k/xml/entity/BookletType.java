package by.epam.java.training.assanoooovi4k.xml.entity;

public enum BookletType {
    WITH_ONE_FOLD("One-fold booklet"),
    WITH_TWO_FOLDS("Duplex booklet"),
    WITH_THREE_FOLDS("Three-fold booklet"),
    WITH_FOUR_FOLDS("Four-fold booklet");

    private String value;

    BookletType(String value) {
        this.value = value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

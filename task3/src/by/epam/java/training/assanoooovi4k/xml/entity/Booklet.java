package by.epam.java.training.assanoooovi4k.xml.entity;

public class Booklet extends Paper{
    private String nameOfCompany;
    private BookletType bookletType;

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public void setNameOfCompany(String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
    }

    public BookletType getBookletType() {
        return bookletType;
    }

    public void setBookletType(BookletType bookletType) {
        this.bookletType = bookletType;
    }

    public void setBookletTypeValue(String value) {
        this.bookletType.setValue(value);
    }

    @Override
    public String toString() {
        return "Booklet{" + super.toString() +
                "nameOfCompany='" + nameOfCompany + '\'' +
                ", bookletType=" + bookletType +
                '}';
    }
}

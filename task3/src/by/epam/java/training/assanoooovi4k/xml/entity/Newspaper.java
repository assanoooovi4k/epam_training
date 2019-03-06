package by.epam.java.training.assanoooovi4k.xml.entity;

public class Newspaper extends Paper{
    private int subscriptionIndex;
    private NewspaperType newspaperType;

    public int getSubscriptionIndex() {
        return subscriptionIndex;
    }

    public void setSubscriptionIndex(int subscriptionIndex) {
        this.subscriptionIndex = subscriptionIndex;
    }

    public NewspaperType getNewspaperType() {
        return newspaperType;
    }

    public void setNewspaperType(NewspaperType newspaperType) {
        this.newspaperType = newspaperType;
    }

    public void setNewspaperTypeValue(String value) {
        this.newspaperType.setValue(value);
    }

    @Override
    public String toString() {
        return "Newspaper{" + super.toString() +
                "subscriptionIndex=" + subscriptionIndex +
                ", newspaperType=" + newspaperType +
                '}';
    }
}

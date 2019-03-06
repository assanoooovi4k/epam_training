package by.epam.java.training.assanoooovi4k.xml.entity;

public class Journal extends Paper {
    private int subscriptionIndex;
    private JournalType journalType;

    public int getSubscriptionIndex() {
        return subscriptionIndex;
    }

    public void setSubscriptionIndex(int subscriptionIndex) {
        this.subscriptionIndex = subscriptionIndex;
    }

    public JournalType getJournalType() {
        return journalType;
    }

    public void setJournalType(JournalType journalType) {
        this.journalType = journalType;
    }

    public void setJournalTypeValue(String value) {
        this.journalType.setValue(value);
    }

    @Override
    public String toString() {
        return "Journal{" + super.toString() +
                "subscriptionIndex=" + subscriptionIndex +
                ", journalType=" + journalType +
                '}';
    }
}

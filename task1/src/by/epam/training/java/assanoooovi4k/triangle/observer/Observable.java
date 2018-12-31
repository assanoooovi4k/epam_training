package by.epam.training.java.assanoooovi4k.triangle.observer;

public interface Observable {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

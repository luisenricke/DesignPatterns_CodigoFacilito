package Behavioral.Observer;

public interface IObservable {
    void addObserver(IObserver iObserver);
    void notifyObservers();
    void removeObserver();
}

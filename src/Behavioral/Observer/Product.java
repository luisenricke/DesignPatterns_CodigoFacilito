package Behavioral.Observer;

import java.util.LinkedHashSet;
import java.util.Set;

public class Product implements IObservable {
    private int stock;
    private Set<IObserver> observers;


    public Product(int stock) {
        this.stock = stock;
        this.observers = new LinkedHashSet<>();
    }

    @Override
    public void addObserver(IObserver iObserver) {
        this.observers.add(iObserver);
    }

    @Override
    public void notifyObservers() {
        for (IObserver o : this.observers) {
            o.notify("The product was sold");
        }
    }

    @Override
    public void removeObserver() {

    }

    public void sale(){
        this.setStock(this.stock-1);
        System.out.println("Sale made");
        this.notifyObservers();
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}

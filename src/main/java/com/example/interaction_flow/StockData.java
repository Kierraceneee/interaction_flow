package com.example.interaction_flow;

import java.util.ArrayList;
import java.util.List;

public class StockData implements Subject {
    private List<Observer> observers;
    private float price;

    public StockData() {
        observers = new ArrayList<>();
    }

    public void setPrice(float price) {
        this.price = price;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(price);
        }
    }
}


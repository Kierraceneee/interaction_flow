package com.example.interaction_flow;

public class CurrentPriceDisplay implements Observer {
    private float price;

    @Override
    public void update(float price) {
        this.price = price;
        display();
    }

    public void display() {
        System.out.println("Current price: " + "$" + price);
    }

}

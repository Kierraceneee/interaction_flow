package com.example.interaction_flow;

import java.util.ArrayList;
import java.util.List;

public class AveragePriceDisplay implements Observer{
    private List<Float> prices;

    public AveragePriceDisplay(){
        prices = new ArrayList<>();

    }
    @Override
    public void update(float price) {
        prices.add(price);
        display();
    }

    public void display() {
        float sum = 0;
        for (float price : prices) {
            sum += price;
        }
        float average = sum / prices.size();
        System.out.println("Average price: " + " $" + average);
    }

}

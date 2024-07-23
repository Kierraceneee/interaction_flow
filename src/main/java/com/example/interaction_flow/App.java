package com.example.interaction_flow;

public class App {
    public static void main(String[] args){
        StockData stockData = new StockData();
        CurrentPriceDisplay currentPriceDisplay = new CurrentPriceDisplay();
        AveragePriceDisplay averagePriceDisplay = new AveragePriceDisplay();

        stockData.registerObserver(currentPriceDisplay);
        stockData.registerObserver(averagePriceDisplay);

        stockData.setPrice(150.73f);
        stockData.setPrice(11.45f);
        stockData.setPrice(201.17f);
    }
}

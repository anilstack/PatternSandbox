package com.patternsandbox.anilstack.behavioral.helper.impl;

import com.patternsandbox.anilstack.behavioral.helper.Observer;
import com.patternsandbox.anilstack.behavioral.helper.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 */
public class Stockdata implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private String stockName;
    private double price;


    @Override
    public void registerObserver(Observer observer) {
            observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer:observers) {
            observer.update(stockName, price);
        }
    }

    public void setStockData(String stockName, double price) {
        this.stockName = stockName;
        this.price = price;
        notifyObservers();
    }
}

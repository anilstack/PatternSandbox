package com.patternsandbox.anilstack.behavioral.helper;

import com.patternsandbox.anilstack.behavioral.helper.Observer;

public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

    void notifyObservers();

}

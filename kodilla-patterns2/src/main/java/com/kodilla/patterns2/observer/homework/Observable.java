package com.kodilla.patterns2.observer.homework;

public interface Observable {
    void registerObserver(Observer observer);
    void notifyObservers(Assignment assignment);
    void removeObserver(Observer observer);
}

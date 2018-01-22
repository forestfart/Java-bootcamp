package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class BootCampGroup implements Observable {
    private final List<Observer> observers;
    private final List<Assignment> assignments;
    private final String groupName;

    public BootCampGroup(String groupName) {
        observers = new ArrayList<>();
        assignments = new ArrayList<>();
        this.groupName = groupName;
    }

    public void addAssignment(Assignment assignment) {
        assignments.add(assignment);
        notifyObservers(assignment);
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers(Assignment assignment) {
        for(Observer observer : observers) {
            if (observer.isToBeNotified()) {
                observer.update(this, assignment);
            }
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }
}

package com.kodilla.patterns2.observer.homework;

public interface Observer {
    void update(BootCampGroup bootCampGroup, Assignment assignment);
    boolean isToBeNotified();
}
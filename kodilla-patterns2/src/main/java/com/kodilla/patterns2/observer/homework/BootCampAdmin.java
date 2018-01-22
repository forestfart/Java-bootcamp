package com.kodilla.patterns2.observer.homework;

public class BootCampAdmin implements Observer {
    private final String mentorName;
    private final boolean isToBeNotified;
    private int updateCount;

    public BootCampAdmin(String mentorName, boolean isToBeNotified) {
        this.mentorName = mentorName;
        this.isToBeNotified = isToBeNotified;
    }

    @Override
    public void update(BootCampGroup bootCampGroup, Assignment assignment) {
        System.out.println("@" + mentorName + ": New assignment has been added to queue by " + assignment.getStudentName() + " (total: " + bootCampGroup.getAssignments().size() + " assignments awaits your reply)");
        updateCount++;
    }

    @Override
    public boolean isToBeNotified() {
        return isToBeNotified;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}

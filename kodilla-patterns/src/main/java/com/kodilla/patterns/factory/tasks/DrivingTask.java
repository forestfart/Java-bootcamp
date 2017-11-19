package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    final String taskName;
    final String destination;
    final String vehicle;
    boolean taskStatus = false;

    public DrivingTask(String taskName, String destination, String vehicle) {
        this.taskName = taskName;
        this.destination = destination;
        this.vehicle = vehicle;
    }

    public void executeTask() {
        System.out.println("brumm...");
        taskStatus = true;
    }

    public String getTaskName() {
        return taskName;
    }

    public boolean isTaskExecuted() {
        return taskStatus;
    }
}

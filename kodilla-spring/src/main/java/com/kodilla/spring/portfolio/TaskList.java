package com.kodilla.spring.portfolio;

import java.util.ArrayList;

public final class TaskList {
    final ArrayList<String> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public ArrayList<String> getTasks() {
        return tasks;
    }

    public void addTask(final String taskName) {
        tasks.add(taskName);
    }
}

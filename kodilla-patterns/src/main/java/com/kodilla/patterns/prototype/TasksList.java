package com.kodilla.patterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class TasksList {
    final String name;
    final List<Task> tasks = new ArrayList<>();

    public TasksList(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        String s = "      TasksList{" + name + '\'';
        for(Task task : tasks) {
            s = s + "\n" + task.toString();
        }
        return s;
    }
}

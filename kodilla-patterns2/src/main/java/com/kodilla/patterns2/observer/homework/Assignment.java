package com.kodilla.patterns2.observer.homework;

public class Assignment {
    private final String assignmentTopic;
    private final String studentName;

    public Assignment(String assignmentTopic, String stuentName) {
        this.assignmentTopic = assignmentTopic;
        this.studentName = stuentName;
    }

    public String getAssignmentTopic() {
        return assignmentTopic;
    }

    public String getStudentName() {
        return studentName;
    }
}

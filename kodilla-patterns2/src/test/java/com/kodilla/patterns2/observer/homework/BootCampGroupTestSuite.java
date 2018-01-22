package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BootCampGroupTestSuite {

    @Test
    public void testAssignmentsQueue() {

        // Given
        BootCampGroup javaBootCampGroup = new JavaBootCampHomeWork();
        BootCampGroup pythonBootCampGroup = new PythonBootCampHomeWork();

        BootCampAdmin mentorJava = new BootCampAdmin("John Smith", true);
        BootCampAdmin mentorPython = new BootCampAdmin("Rachel Kovalsky", true);
        BootCampAdmin bootCampCoordinator = new BootCampAdmin("Kali Duzojeść", false);

        javaBootCampGroup.registerObserver(mentorJava);
        pythonBootCampGroup.registerObserver(mentorPython);
        javaBootCampGroup.registerObserver(bootCampCoordinator);
        pythonBootCampGroup.registerObserver(bootCampCoordinator);

        // When
        javaBootCampGroup.addAssignment(new Assignment("Exercise 20.2 - decorator pattern", "Freddy Mercury"));
        javaBootCampGroup.addAssignment(new Assignment("Exercise 20.3 - aspect oriented programming", "Freddy Mercury"));
        pythonBootCampGroup.addAssignment(new Assignment("Exercise solve sudoku array", "Mona Lisa"));

        // Then
        assertEquals(2, mentorJava.getUpdateCount());
        assertEquals(1, mentorPython.getUpdateCount());
        assertEquals(0, bootCampCoordinator.getUpdateCount());
    }
}

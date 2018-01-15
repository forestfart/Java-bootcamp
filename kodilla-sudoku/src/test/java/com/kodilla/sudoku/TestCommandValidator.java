package com.kodilla.sudoku;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestCommandValidator {
    private String testInput;

    @Test
    public void testCase1() {
        // Given
        CommandValidator commandValidator = new CommandValidator();

        // When
        testInput = "111,";

        // Then
        assertTrue(commandValidator.validate(testInput));
    }

    @Test
    public void testCase2() {
        // Given
        CommandValidator commandValidator = new CommandValidator();

        // When
        testInput = "123,123,123,352,265,";

        // Then
        assertTrue(commandValidator.validate(testInput));
    }

    @Test
    public void testCase3() {
        // Given
        CommandValidator commandValidator = new CommandValidator();

        // When
        testInput = "1,";

        // Then
        assertFalse(commandValidator.validate(testInput));
    }

    @Test
    public void testCase4() {
        // Given
        CommandValidator commandValidator = new CommandValidator();

        // When
        testInput = "111";

        // Then
        assertFalse(commandValidator.validate(testInput));
    }

    @Test
    public void testCase5() {
        // Given
        CommandValidator commandValidator = new CommandValidator();

        // When
        testInput = ",,,";

        // Then
        assertFalse(commandValidator.validate(testInput));
    }

    @Test
    public void testCase6() {
        // Given
        CommandValidator commandValidator = new CommandValidator();

        // When
        testInput = "qwertyuiopasdfghjklzxcvbnm,./";

        // Then
        assertFalse(commandValidator.validate(testInput));
    }

    @Test
    public void testCase7() {
        // Given
        CommandValidator commandValidator = new CommandValidator();

        // When
        testInput = "1234567890";

        // Then
        assertFalse(commandValidator.validate(testInput));
    }

    @Test
    public void testCase8() {
        // Given
        CommandValidator commandValidator = new CommandValidator();

        // When
        testInput = "\n";

        // Then
        assertFalse(commandValidator.validate(testInput));
    }

    @Test
    public void testCase9() {
        // Given
        CommandValidator commandValidator = new CommandValidator();

        // When
        testInput = "1234,123,645,345,765";

        // Then
        assertFalse(commandValidator.validate(testInput));
    }

    @Test
    public void testCase10() {
        // Given
        CommandValidator commandValidator = new CommandValidator();

        // When
        testInput = "xxx,xxx,";

        // Then
        assertFalse(commandValidator.validate(testInput));
    }
}
package com.kodilla.sudoku;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestCommandValidator {

    @Test
    public void testCommandValidator() {
        // Given
        CommandValidator commandValidator = new CommandValidator();
        String testInput1, testInput2, testInput3, testInput4, testInput5, testInput6, testInput7, testInput8, testInput9, testInput10;

        // When
        testInput1 = "111,";
        testInput2 = "123,123,123,352,265,";
        testInput3 = "1,";
        testInput4 = "111";
        testInput5 = ",,,";
        testInput6 = "qwertyuiopasdfghjklzxcvbnm,./";
        testInput7 = "1234567890";
        testInput8 = "\n";
        testInput9 = "1234,123,645,345,765,";
        testInput10 = "xxx,xxx,";

        // Then
        assertTrue(commandValidator.validate(testInput1));
        assertTrue(commandValidator.validate(testInput2));
        assertFalse(commandValidator.validate(testInput3));
        assertFalse(commandValidator.validate(testInput4));
        assertFalse(commandValidator.validate(testInput5));
        assertFalse(commandValidator.validate(testInput6));
        assertFalse(commandValidator.validate(testInput7));
        assertFalse(commandValidator.validate(testInput8));
        assertFalse(commandValidator.validate(testInput9));
        assertFalse(commandValidator.validate(testInput10));
    }

}
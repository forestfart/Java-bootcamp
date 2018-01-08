package com.kodilla.sudoku;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestSudokuElement {

    @Test
    public void isAvailable() {
        //Given and When
        SudokuElement sudokuElement1 = new SudokuElement(1);
        SudokuElement sudokuElement0 = new SudokuElement(0);
        SudokuElement sudokuElement9 = new SudokuElement(9);

        //Then
        assertTrue(sudokuElement1.isAvailable(0));
        assertFalse(sudokuElement1.isAvailable(1));
        assertTrue(sudokuElement1.isAvailable(9));
        assertTrue(sudokuElement0.isAvailable(1));
        assertFalse(sudokuElement0.isAvailable(0));
        assertTrue(sudokuElement0.isAvailable(9));
        assertTrue(sudokuElement9.isAvailable(1));
        assertFalse(sudokuElement9.isAvailable(9));
        assertTrue(sudokuElement9.isAvailable(0));
    }

    @Test
    public void setValue() {
        //Given
        SudokuElement sudokuElement1 = new SudokuElement(1);
        SudokuElement sudokuElement0 = new SudokuElement(0);
        SudokuElement sudokuElement9 = new SudokuElement(9);

        // When
        sudokuElement0.setValue(1);
        sudokuElement1.setValue(9);
        sudokuElement9.setValue(0);

        // Then
        assertEquals(1,sudokuElement0.getValue());
        assertEquals(9,sudokuElement1.getValue());
        assertEquals(0,sudokuElement9.getValue());
    }

    @Test
    public void removeFromAvailableValues() {
        //Given
        SudokuElement sudokuElement1 = new SudokuElement(1);
        SudokuElement sudokuElement0 = new SudokuElement(0);
        SudokuElement sudokuElement9 = new SudokuElement(9);

        // When
        sudokuElement0.removeFromAvailableValues(1);
        sudokuElement1.removeFromAvailableValues(9);
        sudokuElement9.removeFromAvailableValues(0);

        // Then
        assertFalse(sudokuElement0.isAvailable(1));
        assertFalse(sudokuElement1.isAvailable(9));
        assertFalse(sudokuElement9.isAvailable(0));
    }

    @Test
    public void addToAvailableValues() {
        //Given
        SudokuElement sudokuElement1 = new SudokuElement(5);
        SudokuElement sudokuElement0 = new SudokuElement(5);
        SudokuElement sudokuElement9 = new SudokuElement(5);

        // When
        sudokuElement1.setValue(1);
        sudokuElement0.setValue(9);
        sudokuElement9.setValue(0);

        // Then
        assertTrue(sudokuElement1.isAvailable(5));
        assertTrue(sudokuElement0.isAvailable(5));
        assertTrue(sudokuElement9.isAvailable(5));
    }

    @Test
    public void getValue() {
        //Given
        SudokuElement sudokuElement1 = new SudokuElement(1);
        SudokuElement sudokuElement0 = new SudokuElement(0);
        SudokuElement sudokuElement9 = new SudokuElement(9);

        // When and Then
        assertEquals(0,sudokuElement0.getValue());
        assertEquals(1,sudokuElement1.getValue());
        assertEquals(9,sudokuElement9.getValue());
    }

    @Test
    public void getAvailableValues() {
        //Given
        SudokuElement sudokuElement1 = new SudokuElement(1);
        SudokuElement sudokuElement0 = new SudokuElement(0);
        SudokuElement sudokuElement9 = new SudokuElement(9);

        // When and Then
        assertEquals(9,sudokuElement0.getAvailableValues().size());
        assertEquals(9,sudokuElement1.getAvailableValues().size());
        assertEquals(9,sudokuElement9.getAvailableValues().size());

    }

}
package com.kodilla.sudoku;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

public class SudokuSolverTest {
    @Test
    public void isAvailable() {
        // Given
        SudokuGame sudokuGame = new SudokuGame();
        List<List<SudokuElement>> sudokuArray = sudokuGame.createNewGame();

        // When

        sudokuArray.get(0).get(0).setValue(1);
        SudokuSolver sudokuSolver = new SudokuSolver(sudokuArray);

        // Then
        assertFalse(sudokuSolver.isAvailable(0,0,1));
        assertFalse(sudokuSolver.isAvailable(0,1,1));
        assertFalse(sudokuSolver.isAvailable(0,2,1));
        assertFalse(sudokuSolver.isAvailable(1,0,1));
        assertFalse(sudokuSolver.isAvailable(2,0,1));
        assertTrue(sudokuSolver.isAvailable(3,3,1));
        assertTrue(sudokuSolver.isAvailable(8,8,1));
    }

    @Test
    public void nextSudokuElement() {
        // Given
        SudokuGame sudokuGame = new SudokuGame();
        List<List<SudokuElement>> sudokuArray = sudokuGame.createNewGame();
        SudokuSolver sudokuSolver = new SudokuSolver(sudokuArray);

        // When and Then
        assertTrue(sudokuSolver.nextSudokuElement(8,8));
        assertTrue(sudokuSolver.nextSudokuElement(1,1));
        assertTrue(sudokuSolver.nextSudokuElement(1,8));
    }

    @Test
    public void solveSudoku() {
        // Given
        SudokuGame sudokuGame = new SudokuGame();
        List<List<SudokuElement>> sudokuArraySolvable = sudokuGame.createNewGame();
        List<List<SudokuElement>> sudokuArrayUnsolvable = sudokuGame.createNewGame();

        // When
        SudokuSolver goodSudokuSolver = new SudokuSolver(sudokuArraySolvable);

        sudokuArrayUnsolvable.get(0).get(0).setValue(1);
        sudokuArrayUnsolvable.get(0).get(1).setValue(2);
        sudokuArrayUnsolvable.get(0).get(2).setValue(3);
        sudokuArrayUnsolvable.get(0).get(3).setValue(4);
        sudokuArrayUnsolvable.get(0).get(4).setValue(5);
        sudokuArrayUnsolvable.get(0).get(5).setValue(6);
        sudokuArrayUnsolvable.get(0).get(6).setValue(7);
        sudokuArrayUnsolvable.get(0).get(7).setValue(8);
        sudokuArrayUnsolvable.get(0).get(8).setValue(9);
        sudokuArrayUnsolvable.get(1).get(0).setValue(4);
        sudokuArrayUnsolvable.get(1).get(1).setValue(5);
        sudokuArrayUnsolvable.get(1).get(2).setValue(6);
        sudokuArrayUnsolvable.get(1).get(3).setValue(1);
        sudokuArrayUnsolvable.get(1).get(4).setValue(2);
        sudokuArrayUnsolvable.get(1).get(5).setValue(3);

        sudokuGame.printArray();

        SudokuSolver badSudokuSolver = new SudokuSolver(sudokuArrayUnsolvable);

        // Then
        assertTrue(goodSudokuSolver.solveSudoku(0,0));
        assertFalse(badSudokuSolver.solveSudoku(0,0));
    }
}
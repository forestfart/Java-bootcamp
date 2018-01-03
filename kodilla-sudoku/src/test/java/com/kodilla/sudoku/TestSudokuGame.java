package com.kodilla.sudoku;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestSudokuGame {

    public void printAllAvailabilities(List<List<SudokuElement>> sudokuArray) {
        String availableArray;

        for (int rowIndex = 0; rowIndex < 9; rowIndex++) {
            for (int columnIndex = 0; columnIndex < 9; columnIndex++) {
                availableArray = sudokuArray.get(rowIndex).get(columnIndex).getAvailableValues().toString();
                for (int i=availableArray.length(); i< 29; i++) {
                    availableArray = availableArray + " ";
                }
                System.out.print(availableArray + " ");
            }
            System.out.println("\n");
        }
    }

    @Test
    public void testFillSudokuArrayFirst3x3 () {
        //Given
        List<List<SudokuElement>> sudokuArray;
        SudokuGame sudokuGame = new SudokuGame();
        sudokuArray = sudokuGame.createNewGame();

        //When

        sudokuArray = sudokuGame.fillSudokuArray(sudokuArray, "111,122,133,214,225,236,317,328,");
        sudokuGame.printArray(sudokuArray);

        //Then
        printAllAvailabilities(sudokuArray);

        int expectedValue3x3 = sudokuArray.get(2).get(2).getAvailableValues().get(0);
        List<Integer> expectedValue9x1 = sudokuArray.get(8).get(0).getAvailableValues();

        Assert.assertEquals(9, expectedValue3x3);
        Assert.assertEquals(6, expectedValue9x1.size());
    }

    @Test
    public void testSudokuElementAvailableValues () {
        //Given
        List<List<SudokuElement>> sudokuArray;
        SudokuGame sudokuGame = new SudokuGame();
        sudokuArray = sudokuGame.createNewGame();

        //When

        sudokuArray = sudokuGame.fillSudokuArray(sudokuArray, "441,452,463,544,555,566,647,658,669,");
        sudokuGame.printArray(sudokuArray);

        //Then
        printAllAvailabilities(sudokuArray);

        List<Integer> expectedList6x6 = sudokuArray.get(5).get(5).getAvailableValues();
        int expectedValue6x6 = expectedList6x6.get(0);

        Assert.assertEquals(1, expectedList6x6.size());
        Assert.assertEquals(0, expectedValue6x6);
    }

    @Test
    public void testSudokuArrayModification() {
        //Given
        List<List<SudokuElement>> sudokuArray;
        SudokuGame sudokuGame = new SudokuGame();
        sudokuArray = sudokuGame.createNewGame();

        //When
        sudokuArray = sudokuGame.fillSudokuArray(sudokuArray, "441,442,443,444,555,556,997,998,999,");
        sudokuGame.printArray(sudokuArray);

        //Then
        printAllAvailabilities(sudokuArray);

        List<Integer> expectedList6x6 = sudokuArray.get(5).get(5).getAvailableValues();
        int expectedValue6x6 = expectedList6x6.get(0);

        Assert.assertEquals(7, expectedList6x6.size());
        Assert.assertEquals(7, expectedValue6x6);
    }
}

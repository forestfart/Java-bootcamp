package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuGame {
    public static int EMPTY = 0;
    public boolean exit = false;

    public void printArray(final List<List<SudokuElement>> sudokuArray) {
        List<SudokuElement> row;
        System.out.println("\n  r \\ c    1   2   3   4   5   6   7   8   9           Sudoku Game help:\n                                                       ...................................");
        for (int rowIndex = 0; rowIndex < 9; rowIndex++) {
            row = sudokuArray.get(rowIndex);
            System.out.print("  " + (rowIndex + 1) + "      |");
            for (int columnIndex = 0; columnIndex < 9; columnIndex++ ) {
                if (row.get(columnIndex).getValue() == EMPTY) {
                    System.out.print("   |");
                } else {
                    System.out.print(" " + row.get(columnIndex).getValue() + " |");
                }
                if (columnIndex == 8) {
                    switch (rowIndex) {
                        case 0:
                            System.out.print("            r - row (1..9)");
                            break;
                        case 1:
                            System.out.print("            c - column (1..9)");
                            break;
                        case 2:
                            System.out.print("            v - value (1..9 or 0 to empty)");
                            break;
                        case 3:
                            System.out.print("          type 'rcv,rcv,...,' to insert values");
                            break;
                        case 4:
                            System.out.print("          type 'exit' to finish");
                            break;
                        case 5:
                            System.out.print("         ....................................");
                            break;
                        case 6:
                            if (sudokuArrayValidate(sudokuArray)) {
                                System.out.print("         The board is resolvable");
                            } else {
                                System.out.print("         The board is unresolvable!! please modify values");
                            }
                            break;
                        case 7:
                            System.out.print("         free");
                            break;
                        case 8:
                            System.out.print("         free");
                            break;
                    }
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public List<List<SudokuElement>> fillSudokuArray(List<List<SudokuElement>> sudokuArray, String command) {
        try {
            int insertValue;
            for (int i=0; i<command.length()/4; i++) {
                insertValue = Character.getNumericValue(command.charAt((i*4)+2));
                sudokuArray.get(Character.getNumericValue(command.charAt(i*4))-1).get(Character.getNumericValue(command.charAt((i*4)+1))-1).setValue(insertValue);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return sudokuArray;
    }

    public boolean sudokuArrayValidate(List<List<SudokuElement>> sudokuArray) {
        boolean isValidated = false;



        return isValidated;
    }

    public List<List<SudokuElement>> createNewGame() {

        List<List<SudokuElement>> sudokuArray = new ArrayList<>();
        for (int rowIndex = 0; rowIndex < 9; rowIndex++) {
            List<SudokuElement> rowList = new ArrayList<>();
            for (int columnIndex = 0; columnIndex < 9; columnIndex++) {
                rowList.add(new SudokuElement(EMPTY));
            }
            sudokuArray.add(rowList);
        }
        return sudokuArray;
    }

    public boolean resolveSudoku() {

        return exit;
    }
}

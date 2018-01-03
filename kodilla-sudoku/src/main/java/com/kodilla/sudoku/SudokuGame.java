package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuGame {
    public static int EMPTY = 0;

    public void printArray(final List<List<SudokuElement>> sudokuArray) {
        List<SudokuElement> row;
        System.out.println("\n  r \\ c    1   2   3   4   5   6   7   8   9           Sudoku Game help:\n                                                       ......................................");
        for (int rowIndex = 0; rowIndex < 9; rowIndex++) {
            row = sudokuArray.get(rowIndex);
            System.out.print("  " + (rowIndex + 1) + "      |");
            for (int columnIndex = 0; columnIndex < 9; columnIndex++) {
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
                            System.out.print("          type 'sudoku' to find a solution");
                            break;
                        case 6:
                            System.out.print("          type 'new game' to reset");
                            break;
                        case 7:
                            System.out.print("         .......................................");
                            break;
                        case 8:
                            System.out.print("                                      good luck!");
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
            int row, column, currentValue, insertValue;

            for (int stringIndex = 0; stringIndex < command.length() / 4; stringIndex++) {

                row = Character.getNumericValue(command.charAt(stringIndex * 4)) - 1;
                column = Character.getNumericValue(command.charAt((stringIndex * 4) + 1)) - 1;
                currentValue = sudokuArray.get(row).get(column).getValue();
                insertValue = Character.getNumericValue(command.charAt((stringIndex * 4) + 2));

                if (currentValue == insertValue) {
                    System.out.println("The value " + insertValue + " is already there at row " + (row + 1) + ", column " + (column + 1));

                } else if (currentValue != insertValue) {

                    if (sudokuArray.get(row).get(column).setValue(insertValue)) {
                        if (currentValue != 0) {
                            for (int columnIndex = 0; columnIndex < 9; columnIndex++) {
                                sudokuArray.get(row).get(columnIndex).addToAvailableValues(currentValue);
                            }
                            for (int rowIndex = 0; rowIndex < 9; rowIndex++) {
                                sudokuArray.get(rowIndex).get(column).addToAvailableValues(currentValue);
                            }
                            for (int columnIndex = column / 3 * 3; columnIndex < column / 3 * 3 + 3; columnIndex++) {
                                for (int rowIndex = row / 3 * 3; rowIndex < row / 3 * 3 + 3; rowIndex++) {
                                    sudokuArray.get(rowIndex).get(columnIndex).addToAvailableValues(currentValue);
                                }
                            }
                        }
                        for (int columnIndex = 0; columnIndex < 9; columnIndex++) {
                            sudokuArray.get(row).get(columnIndex).removeFromAvailableValues(insertValue);
                        }
                        for (int rowIndex = 0; rowIndex < 9; rowIndex++) {
                            sudokuArray.get(rowIndex).get(column).removeFromAvailableValues(insertValue);
                        }
                        for (int columnIndex = column / 3 * 3; columnIndex < column / 3 * 3 + 3; columnIndex++) {
                            for (int rowIndex = row / 3 * 3; rowIndex < row / 3 * 3 + 3; rowIndex++) {
                                sudokuArray.get(rowIndex).get(columnIndex).removeFromAvailableValues(insertValue);
                            }
                        }
                    } else {
                        System.out.println("Illegal to insert " + insertValue + " to row " + (row + 1) + ", column " + (column + 1) + " due to an other existing value. Please try something else..");
                    }
                } else {
                    System.out.println("Impossible to insert " + insertValue + " (row " + (row + 1) + ", column " + (column + 1) + "). Please try something else..");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return sudokuArray;
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
}
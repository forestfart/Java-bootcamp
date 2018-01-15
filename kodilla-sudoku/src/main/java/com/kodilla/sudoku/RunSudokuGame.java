package com.kodilla.sudoku;

import java.util.List;
import java.util.Scanner;

public class RunSudokuGame {

    public static void main(String[] args) {

        boolean gameFinished = false;
        List<List<SudokuElement>> sudokuArray;

        Scanner scanner = new Scanner(System.in);
        CommandValidator commandValidator = new CommandValidator();
        SudokuGame sudokuGame = new SudokuGame();

        sudokuArray = sudokuGame.createNewGame();

        while (!gameFinished) {
            sudokuGame.printArray(sudokuArray);
            String command = scanner.nextLine();
            switch (command) {
                case "new game":
                    sudokuArray = sudokuGame.createNewGame();
                    break;

                case "sudoku":
                    SudokuSolver sudokuSolver = new SudokuSolver(sudokuArray);
                    if (sudokuSolver.solveSudoku(0,0)) {
                        for (int i = 0; i < 9; i++) {
                            for (int j = 0; j < 9; j++) {
                                sudokuArray.get(i).get(j).getAvailableValues().clear();
                                sudokuArray.get(i).get(j).getAvailableValues().add(0);
                            }
                        }
                    } else {
                        System.out.println("Array has no solution! please modify an element..");
                    }
                    break;

                case "exit":
                    gameFinished = true;

                default:
                    if (commandValidator.validate(command)) {
                        sudokuArray = sudokuGame.fillSudokuArray(sudokuArray, command);
                    }
            }
        }
    }
}
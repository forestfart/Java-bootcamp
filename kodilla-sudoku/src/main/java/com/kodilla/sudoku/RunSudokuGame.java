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

            //gameFinished = sudokuGame.resolveSudoku();
            String command = scanner.nextLine();
            if (command.equals("exit")) {
                gameFinished = true;
            } else {
                if (commandValidator.validate(command)) {
                    sudokuArray = sudokuGame.fillSudokuArray(sudokuArray, command);
                }


            }
        }
    }

}
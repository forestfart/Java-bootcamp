package com.kodilla.rps;

import java.util.Scanner;

public class CommandValidator {
    private static final String STONE = "stone";
    private static final String PAPER = "paper";
    private static final String SCISSORS = "scissors";

    public int validateNumber(String roundsNumber) {
        if (roundsNumber.isEmpty()) {
            return 0;
        }
        roundsNumber = roundsNumber.replaceAll(" ", "");
        char[] charNumber = roundsNumber.toCharArray();
        for (int i = 0; i < charNumber.length; i++) {
            if (!Character.isDigit(charNumber[i])) {
                return 0;
            }
        }
        return Integer.parseInt(roundsNumber);
    }

    public String validateGameInput(String input, Scanner scanner, UserInterface userInterface) {
        while (!input.equals("1") || !input.equals("2") || !input.equals("3") || !input.equals("x") || !input.equals("n")){
            switch (input) {
                case "1":
                    return STONE;
                case "2":
                    return PAPER;
                case "3":
                    return SCISSORS;
                case "x":
                    userInterface.quitConfirmationMessage();
                    input = scanner.nextLine();
                    if (input.toUpperCase().equals("Y")) { return "x"; }
                    break;
                case "n":
                    userInterface.newGameConfirmationMessage();
                    input = scanner.nextLine();
                    if (input.toUpperCase().equals("Y")) { return "n"; }
                    break;
                default:
                    userInterface.incorrectGameInput();
                    input = scanner.nextLine();
            }
        }
        return input;
    }

    public String validateEndOfGameChoice(String input, Scanner scanner, UserInterface userInterface) {
        while (!input.equals("x") || !input.equals("n")){
            switch (input) {
                case "x":
                    userInterface.quitConfirmationMessage();
                    input = scanner.nextLine();
                    if (input.toUpperCase().equals("Y")) { return "x"; }
                    break;
                case "n":
                    userInterface.newGameConfirmationMessage();
                    input = scanner.nextLine();
                    if (input.toUpperCase().equals("Y")) { return "n"; }
                    break;
                default:
                    userInterface.incorrectEndOfGameInput();
                    input = scanner.nextLine();
            }
        }
        return input;
    }
}

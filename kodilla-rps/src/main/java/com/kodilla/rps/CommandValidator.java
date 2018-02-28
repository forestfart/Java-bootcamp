package com.kodilla.rps;

import java.util.Scanner;

import static com.kodilla.rps.Shapes.*;

public class CommandValidator {
    private static final String EXIT = "x";
    private static final String NEW_GAME = "n";
    private static final String YES = "Y";
    private static final String MENU_CHOICE_1 = "1";
    private static final String MENU_CHOICE_2 = "2";
    private static final String MENU_CHOICE_3 = "3";


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
        while (true) {
            switch (input) {
                case MENU_CHOICE_1:
                    return STONE.getText();
                case MENU_CHOICE_2:
                    return PAPER.getText();
                case MENU_CHOICE_3:
                    return SCISSORS.getText();
                case EXIT:
                    userInterface.quitConfirmationMessage();
                    input = scanner.nextLine();
                    if (input.toUpperCase().equals(YES)) { return EXIT; }
                    break;
                case NEW_GAME:
                    userInterface.newGameConfirmationMessage();
                    input = scanner.nextLine();
                    if (input.toUpperCase().equals(YES)) { return NEW_GAME; }
                    break;
                default:
                    userInterface.incorrectGameInput();
                    input = scanner.nextLine();
            }
        }
    }

    public String validateEndOfGameChoice(String input, Scanner scanner, UserInterface userInterface) {
        while (true) {
            switch (input) {
                case EXIT:
                    userInterface.quitConfirmationMessage();
                    input = scanner.nextLine();
                    if (input.toUpperCase().equals(YES)) {
                        return EXIT;
                    }
                    break;
                case NEW_GAME:
                    userInterface.newGameConfirmationMessage();
                    input = scanner.nextLine();
                    if (input.toUpperCase().equals(YES)) {
                        return NEW_GAME;
                    }
                    break;
                default:
                    userInterface.incorrectEndOfGameInput();
                    input = scanner.nextLine();
            }
        }
    }
}

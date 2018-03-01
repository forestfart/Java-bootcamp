package com.kodilla.rps;

import java.util.Scanner;

import static com.kodilla.rps.Shapes.*;

public class RpsGame {
    private static final String EXIT = "x";
    private static final String NEW_GAME = "n";
    private int userScore;
    private int computerScore;

    public boolean run(UserInterface userInterface, Scanner scanner, String playerName) {
        userScore = 0;
        computerScore = 0;
        int roundsPerGame;
        userInterface.askForNumberOfRounds(playerName);
        CommandValidator commandValidator = new CommandValidator();
        do {
            roundsPerGame = commandValidator.validateNumber(scanner.nextLine());
            if (roundsPerGame == 0) {
                userInterface.incorrectRoundsInput();
            }
        } while (roundsPerGame == 0);

        userInterface.mainMenu();

        int roundCount = 0;
        String userInput;
        boolean exit = false;
        Shapes userShape, computerShape;
        ShapeGenerator shapeGenerator = new ShapeGenerator();
        while (roundCount < roundsPerGame) {
            roundCount++;
            userInput = commandValidator.validateGameInput(scanner.nextLine(), scanner, userInterface);
                switch (userInput) {

                    case EXIT:
                        exit = true;
                        roundCount = roundsPerGame; //to exit this while loop
                        break;

                    case NEW_GAME:
                        roundCount = roundsPerGame; // to exit this while loop
                        break;

                    default:
                        userShape = valueOf(userInput.toUpperCase());
                        computerShape = shapeGenerator.generateShape(userShape);
                        userInterface.showRoundResult(userShape, computerShape);
                        if (!userShape.equals(computerShape)) {
                            if (userShape.equals(STONE) && computerShape.equals(SCISSORS) || userShape.equals(SCISSORS) && computerShape.equals(PAPER) || userShape.equals(PAPER) && computerShape.equals(STONE)) {
                                userScore++;
                                userInterface.userWinsMessage(playerName, userScore, computerScore);
                            } else {
                                computerScore++;
                                userInterface.computerWinsMessage(playerName, userScore, computerScore);
                            }
                        } else{
                            userInterface.drawMessage(playerName, userScore, computerScore);
                        }
                }
        }
        userInterface.displayScores(userScore, computerScore);
        userInput = commandValidator.validateEndOfGameChoice(scanner.nextLine(), scanner, userInterface);
        if (userInput.equals(EXIT)) {
            exit = true;
        }
        return exit;
    }
}
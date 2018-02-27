package com.kodilla.rps;

import java.util.Scanner;

public class RpsGame {
    private static final String STONE = "stone";
    private static final String PAPER = "paper";
    private static final String SCISSORS = "scissors";
    private int userScore;
    private int computerScore;
    private int roundsPerGame = 0;
    private String playerName;
    private String userShape;
    private String computerShape;
    private String userInput;
    private Scanner scanner;
    private UserInterface userInterface;
    private CommandValidator commandValidator;
    private ShapeGenerator shapeGenerator;
    private int roundCount;
    private boolean exit;

    public RpsGame(String playerName, UserInterface userInterface, Scanner scanner) {
        this.playerName = playerName;
        this.userInterface = userInterface;
        this.scanner = scanner;
        this.commandValidator = new CommandValidator();
        this.shapeGenerator = new ShapeGenerator();
    }

    public void determineWinner() {

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

    public boolean run() {
        userScore = 0;
        computerScore = 0;
        userInterface.askForNumberOfRounds(playerName);
        do {
            roundsPerGame = commandValidator.validateNumber(scanner.nextLine());
            if (roundsPerGame == 0) {
                userInterface.incorrectRoundsInput();
            }
        } while (roundsPerGame == 0);

        userInterface.mainMenu();

        roundCount = 0;
        while (roundCount < roundsPerGame) {
            roundCount++;
            userInput = commandValidator.validateGameInput(scanner.nextLine(), scanner, userInterface);
                switch (userInput) {

                    case "x":
                        exit = true;
                        roundCount = roundsPerGame; //to exit this while loop
                        break;

                    case "n":
                        roundCount = roundsPerGame; // to exit this while loop
                        break;

                    default:
                        userShape = userInput;
                        computerShape = shapeGenerator.generateShape(userInput);
                        userInterface.showRoundResult(userShape, computerShape);
                        determineWinner();
                }
        }
        userInterface.displayScores(userScore, computerScore);
        userInput = commandValidator.validateEndOfGameChoice(scanner.nextLine(), scanner, userInterface);
        if (userInput.equals("x")) {
            exit = true;
        }
        return exit;
    }
}

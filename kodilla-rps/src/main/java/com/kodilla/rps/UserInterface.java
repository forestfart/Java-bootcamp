package com.kodilla.rps;

public class UserInterface {

    public void welcomeMessage() {
        System.out.println("Welcome to \"Rock-paper-scissors\"!\nPlease tell me your name: ");
    }

    public void askForNumberOfRounds(String playerName) {
        System.out.println(String.format("May the odds be ever in your favor %s! \nType how many rounds you wish to play in one game:", playerName));
    }

    public void incorrectRoundsInput() {
        System.out.println("Incorrect number of rounds, please try again:");
    }

    public void mainMenu() {
        System.out.println("Rules of the game:");
        System.out.println("menu:\n'1' - give \"stone\"" + "\n" + "'2' - give \"paper\""
                + "\n" + "'3' - give \"scissors\"" + "\n" + "'x' - quit game; 'n' - start new game;");
    }

    public void quitConfirmationMessage() {
        System.out.println("Quit game, are you sure? (Y/N)");
    }

    public void newGameConfirmationMessage() {
        System.out.println("Start new game, current results will be lost, are you sure? (Y/N)");
    }

    public void incorrectGameInput() {
        System.out.println("'1', '2', '3', 'n' or 'x' ...please try again: ");
    }

    public void userWinsMessage(String playerName, int userScore, int computerScore) {
        System.out.println(String.format("%s wins! %s won: %d, Computer won: %d", playerName, playerName, userScore, computerScore));
    }

    public void computerWinsMessage(String playerName, int userScore, int computerScore) {
        System.out.println(String.format("Bad luck, computer wins. %s won: %d, Computer won: %d", playerName, userScore, computerScore));
    }

    public void drawMessage(String name, int userScore, int computerScore) {
        System.out.println(String.format("It's a draw! %s won: %d, Computer won: %d", name, userScore, computerScore));
    }

    public void displayScores(int userScore, int computerScore) {
        System.out.println(String.format("-------------------------------------------------" +
                "\nGame Over!" +
                "\nYou have won: %d times, versus computer: %d" +
                "\n-------------------------------------------------", userScore, computerScore));
        System.out.println("\nWould you like try one more time? 'n' - start new game; 'x' - quit;");
    }

    public void showRoundResult(Shapes userShape, Shapes computerShape) {
        System.out.println(String.format(" you:     %s  ------ vs ------ %s    :computer ", userShape, computerShape));
    }

    public void incorrectEndOfGameInput() {
        System.out.println("'n' or 'x' ...please try again: ");
    }
}

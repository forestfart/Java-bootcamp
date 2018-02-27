package com.kodilla.rps;

public class UserInterface {

    public void welcomeMessage() {
        System.out.println("Welcome to \"Rock-paper-scissors\"!\nPlease tell me your name: ");
    }

    public void askForNumberOfRounds(String playerName) {
        System.out.println("May the odds be ever in your favor " + playerName + "! \nType how many rounds you wish to play in one game:");
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
        System.out.println(playerName + " wins!" + " " + playerName + " won: " + userScore + ", Computer won: " + computerScore);
    }

    public void computerWinsMessage(String playerName, int userScore, int computerScore) {
        System.out.println("Bad luck, computer wins." + " " + playerName + " won: " + userScore + ", Computer won: " + computerScore);
    }

    public void drawMessage(String name, int userScore, int computerScore) {
        System.out.println("It's a draw! " + name + " won: " + userScore + ", Computer won: " + computerScore);
    }

    public void displayScores(int userScore, int computerScore) {
        System.out.println("-------------------------------------------------" +
                "\nGame Over!" +
                "\nYou have won: " + userScore + " times. " + ", versus computer: " + computerScore +
                "\n-------------------------------------------------");
        System.out.println("\nWould you like try one more time? 'n' - start new game; 'x' - quit;");
    }

    public void showRoundResult(String userShape, String computerShape) {
        System.out.println(" you:     " + userShape + "  ------ vs ------ " + computerShape + "    :computer ");
    }

    public void incorrectEndOfGameInput() {
        System.out.println("'n' or 'x' ...please try again: ");
    }
}

package com.kodilla.rps;

import java.util.Scanner;

public class RunRpsGame {

    public static void main(String[] args) {

        UserInterface userInterface = new UserInterface();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        userInterface.welcomeMessage();
        String playerName = scanner.nextLine();
        while (!exit) {
            RpsGame rpsGame = new RpsGame(playerName, userInterface, scanner);
            exit = rpsGame.run();
        }
    }
}
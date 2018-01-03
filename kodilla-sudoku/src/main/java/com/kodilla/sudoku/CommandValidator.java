package com.kodilla.sudoku;

public class CommandValidator {

    public CommandValidator() {
    }

    public boolean validate(String command) {

        boolean isValidated = true;

        if (command.length()%4==0) {
            for (int i=0; i<command.length(); i++) {
                if ((i+1)%4!=0 && command.charAt(i)>='0' && command.charAt(i)<='9') {
                } else if ((i+1)%4==0 && Character.toString(command.charAt(i)).equals(",")) {
                } else {
                    System.out.println("incorrect input at position " + (i+1));
                    isValidated = false;
                }
            }
        } else {
            System.out.println("incorrect input type, it should be like '123,' or '123,321,654,'etc. Please try again");
            isValidated = false;
        }
        if (!isValidated) {
            System.out.println("Please try again!");
        }
        return isValidated;
    }
}

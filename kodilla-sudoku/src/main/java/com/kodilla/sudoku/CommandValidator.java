package com.kodilla.sudoku;

import static java.lang.Character.isDigit;

public class CommandValidator {

    public CommandValidator() {
    }

    public boolean isNotNumeric(Character character) {
        if (isDigit(character)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isNotComa(Character character) {
        if (character.charValue()==44) {
            return false;
        } else {
            return true;
        }
    }

    public boolean validate(String command) {

        boolean isValidated = true;
        if (command.length()%4 == 0) {
            for (int i=0; i<command.length(); i++) {
                if (((i+1)%4 != 0) && isNotNumeric(command.charAt(i))) {
                    System.out.println("incorrect digit at position " + (i + 1));
                    isValidated = false;
                }
                if (((i+1)%4 == 0) && isNotComa(command.charAt(i))) {
                    System.out.println("incorrect coma at position " + (i + 1));
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

package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.test.ExceptionHandling;
import com.kodilla.exception.test.SecondChallenge;

public class ExceptionModuleRunner {

    public static void main(String args[]) {

        /*FileReader fileReader = new FileReader();

        try {
            fileReader.readFile();
        } catch (FileReaderException e) {
            System.out.println("Problem while reading a file!");
        }*/

        // zadanie z modułu 8.3

        ExceptionHandling secondChallengeExceptionHandler = new ExceptionHandling();
        secondChallengeExceptionHandler.runExceptionhandling();
    }
}

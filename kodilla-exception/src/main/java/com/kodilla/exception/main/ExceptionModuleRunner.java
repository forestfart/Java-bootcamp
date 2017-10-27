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

        //zadanie z modułu 8.3

        SecondChallenge checkXY = new SecondChallenge();

        try {

            System.out.println(checkXY.probablyIWillThrowException(2,1));

        } catch (Exception e){

            System.out.println(e);
            ExceptionHandling printOutTheRule = new ExceptionHandling();
            printOutTheRule.runExceptionhandling();

        } finally {
            System.out.println("the end.");
        }
    }
}

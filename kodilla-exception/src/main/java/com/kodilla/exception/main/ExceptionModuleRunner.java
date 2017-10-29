package com.kodilla.exception.main;

//import com.kodilla.exception.io.FileReader;
//import com.kodilla.exception.io.FileReaderException;
//import com.kodilla.exception.test.ExceptionHandling;
import com.kodilla.exception.test.FindFlightMockUp;
import com.kodilla.exception.test.Flight;
import com.kodilla.exception.test.RouteNotFoundException;
//import com.kodilla.exception.test.SecondChallenge;

public class ExceptionModuleRunner {

    public static void main(String args[]) {

        /*FileReader fileReader = new FileReader();

        try {
            fileReader.readFile();
        } catch (FileReaderException e) {
            System.out.println("Problem while reading a file!");
        }*/

        // zadanie z modułu 8.3

        /*ExceptionHandling secondChallengeExceptionHandler = new ExceptionHandling();
        secondChallengeExceptionHandler.runExceptionhandling();*/

        //zadanie z modułu 8.4

        FindFlightMockUp flightStatus = new FindFlightMockUp();
        Flight londonToNewYork = new Flight("LHR", "JFK");      // existing route
        Flight notExistingToAny = new Flight("XXX", "LHR");     // example of given incorrect route
        try {
            flightStatus.findFlight(londonToNewYork);       // no troubles here
        } catch (RouteNotFoundException e) {
            System.out.println("Incorrect arrival or departure airport");
        }
        try {
            flightStatus.findFlight(notExistingToAny);      // yes troubles example
        } catch (RouteNotFoundException e) {
            System.out.println("Incorrect arrival or departure airport");
        }
    }
}

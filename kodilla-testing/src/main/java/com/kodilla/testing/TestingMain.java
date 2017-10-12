package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        };

        // test z zadania modułu 6.2
        Calculator simpleCalculator = new Calculator(1,2);

        int addResult = simpleCalculator.add(1,2);
        int subtractResult = simpleCalculator.subtract(3,2);

        //Testind sum function
        if (addResult == 3) {
            System.out.println("Sum test OK");
        } else {
            System.out.println("Sum test failed!!!");
        }

        //Testing subtract function
        if (subtractResult == 1){
            System.out.println("Subtract test OK");
        } else {
            System.out.println("Subtract test failed!!!!");
        }
    }
}

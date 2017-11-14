package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Calculator {
    @Autowired
    Display display;

    public double add(double a, double b) {
        System.out.print("\nSum of: " + a + " and " + b + " is: " );
        return display.displayValue(a + b);
    }

    public double sub(double a, double b) {
        System.out.print("\nSub of: " + a + " and " + b + " is: " );
        return display.displayValue(a - b);
    }

    public double mul(double a, double b) {
        System.out.print("\nMul of: " + a + " and " + b + " is: " );
        return display.displayValue(a * b);
    }

    public double div(double a, double b) {
        System.out.print("\nDiv of: " + a + " and " + b + " is: " );
        return display.displayValue(a/b);
    }
}

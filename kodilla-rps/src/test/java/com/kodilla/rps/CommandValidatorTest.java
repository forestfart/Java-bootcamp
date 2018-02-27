package com.kodilla.rps;

import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class CommandValidatorTest {
    private CommandValidator commandValidator;
    private Scanner scanner;
    private UserInterface userInterface;

    @Before
    public void setUp() {
        commandValidator = new CommandValidator();
        scanner = new Scanner("Y");
        userInterface = new UserInterface();
    }

    @Test
    public void testValidateEmptyString() {
        assertEquals(0, commandValidator.validateNumber(""));
    }

    @Test
    public void testValidateStringWithOtherChars() {
        assertEquals(0, commandValidator.validateNumber("2x2"));
    }

    @Test
    public void testValidateStringWithCorrectNumber() {
        assertEquals(22, commandValidator.validateNumber("22"));
    }

    @Test
    public void testValidateGameStoneInput() {
        assertEquals("stone",commandValidator.validateGameInput("1", scanner, userInterface));
    }

    @Test
    public void testValidateGamePaperInput() {
        assertEquals("paper",commandValidator.validateGameInput("2", scanner, userInterface));
    }

    @Test
    public void testValidateGameScissorsInput() {
        assertEquals("scissors",commandValidator.validateGameInput("3", scanner, userInterface));
    }

    @Test
    public void testValidateGamExitInput() {
        assertEquals("x",commandValidator.validateGameInput("x", scanner, userInterface));
    }

    @Test
    public void testValidateGameNewInput() {
        assertEquals("n",commandValidator.validateGameInput("n", scanner, userInterface));
    }

    @Test
    public void testValidateEndOfGameNewGameChoice() {
        assertEquals("n",commandValidator.validateEndOfGameChoice("n", scanner, userInterface));
    }

    @Test
    public void testValidateEndOfGameQuitChoice() {
        assertEquals("x",commandValidator.validateEndOfGameChoice("x", scanner, userInterface));
    }
}
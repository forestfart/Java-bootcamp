package com.kodilla.rps;

public class ShapeGenerator {
    private static final String STONE = "stone";
    private static final String PAPER = "paper";
    private static final String SCISSORS = "scissors";
    private String generatedShape;

    public String generateShape(String userShape){
        switch (userShape) {
            case STONE:
                generatedShape = Math.random() < 0.5 ? PAPER : (Math.random() >= 0.5 && Math.random() < 0.75 ? SCISSORS : STONE);
                break;
            case PAPER:
                generatedShape = Math.random() < 0.25 ? PAPER : (Math.random() >= 0.25 && Math.random() < 0.75 ? SCISSORS : STONE);
                break;
            case SCISSORS:
                generatedShape = Math.random() < 0.25 ? PAPER : (Math.random() >= 0.25 && Math.random() < 0.5 ? SCISSORS : STONE);
                break;
        }
        return generatedShape;
    }
}

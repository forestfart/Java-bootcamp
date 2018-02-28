package com.kodilla.rps;

import static com.kodilla.rps.Shapes.*;

public class ShapeGenerator {
    private Shapes generatedShape;

    public Shapes generateShape(Shapes userShape){
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

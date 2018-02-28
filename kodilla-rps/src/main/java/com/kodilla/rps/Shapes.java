package com.kodilla.rps;

public enum Shapes {
    STONE("stone"), PAPER("paper"), SCISSORS("scissors");

    private final String text;

    Shapes(final String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}

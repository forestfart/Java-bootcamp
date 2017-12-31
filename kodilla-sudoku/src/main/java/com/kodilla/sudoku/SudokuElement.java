package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuElement {
    private List<Integer> availableValues = new ArrayList<>();
    private int value;

    public SudokuElement(int value) {
        this.value = value;
        for (int i=0; i<10; i++) {
            if (i!=value) {
                availableValues.add(i);
            }
        }
    }

    public final boolean isAvailable(int value) {
        return availableValues.stream().anyMatch(t -> t == value);
    }

    public boolean setValue(int value) {
        if (isAvailable(value)) {
            availableValues.add(this.value);
            this.value = value;
            for (int i=0; i<availableValues.size(); i++) {
                if (availableValues.get(i)==value) {
                    availableValues.remove(i);
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public int getValue() {
        return this.value;
    }

    public List<Integer> getAvailableValues() {
        return availableValues;
    }
}
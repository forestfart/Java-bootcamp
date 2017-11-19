package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task createTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Buy Clothes", "Shirt", 1.0);
            case PAINTING:
                return new PaintingTask("Paint the freaking dirty wall", "Black", "wall");
            case DRIVING:
                return new DrivingTask("Get Back Home", "Home", "Toyota Corolla");
            default:
                return null;
        }
    }
}

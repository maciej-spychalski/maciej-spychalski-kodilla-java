package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "Shopping";
    public static final String PAINTING = "Painting";
    public static final String DRIVING = "Driving";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Shopping fruits", "apples", 4);
            case PAINTING:
                return new PaintingTask("Painting the living room", "lemon", "living room");
            case DRIVING:
                return new DrivingTask("Drive by car", "Bieszczady", "car");
            default:
                return null;
        }
    }
}

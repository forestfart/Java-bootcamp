package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testCreatingDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task driving = taskFactory.createTask(TaskFactory.DRIVING);
        driving.executeTask();

        //Then
        Assert.assertTrue(driving.isTaskExecuted());
        Assert.assertEquals("Get Back Home", driving.getTaskName());
    }

    @Test
    public void testCreatingShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shopping = taskFactory.createTask(TaskFactory.SHOPPING);
        shopping.executeTask();

        //Then
        Assert.assertTrue(shopping.isTaskExecuted());
        Assert.assertEquals("Buy Clothes", shopping.getTaskName());
    }

    @Test
    public void testCreatingPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task painting = taskFactory.createTask(TaskFactory.PAINTING);
        painting.executeTask();

        //Then
        Assert.assertTrue(painting.isTaskExecuted());
        Assert.assertEquals("Paint the freaking dirty wall", painting.getTaskName());
    }
}

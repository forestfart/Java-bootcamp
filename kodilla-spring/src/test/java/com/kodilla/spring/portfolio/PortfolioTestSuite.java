package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Collectors;

public class PortfolioTestSuite {
    @Test
    public void testTaskAss() {
        //Given

        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.toDoList.addTask("task1");
        board.toDoList.addTask("task2");
        board.doneList.addTask("task3");
        board.doneList.addTask("task4");
        board.inProgressList.addTask("task5");
        board.inProgressList.addTask("task6");

        //Then
        Assert.assertEquals("task1task2",board.toDoList.getTasks().stream().collect(Collectors.joining()));
        Assert.assertEquals("task3task4",board.doneList.getTasks().stream().collect(Collectors.joining()));
        Assert.assertEquals("task5task6",board.inProgressList.getTasks().stream().collect(Collectors.joining()));
    }
}

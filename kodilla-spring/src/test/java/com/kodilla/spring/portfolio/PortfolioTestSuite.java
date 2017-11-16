package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PortfolioTestSuite {
    @Test
    public void testTaskAdd() {
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
        Assert.assertEquals(2, board.toDoList.getTasks().size());
        Assert.assertEquals(2,board.doneList.getTasks().size());
        Assert.assertEquals(2,board.inProgressList.getTasks().size());
    }
}

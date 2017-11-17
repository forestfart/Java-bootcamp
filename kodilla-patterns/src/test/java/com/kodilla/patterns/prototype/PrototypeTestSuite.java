package com.kodilla.patterns.prototype;

import org.junit.Assert;
import org.junit.Test;
import java.util.stream.IntStream;

public class PrototypeTestSuite {

    @Test
    public void testToString() {
        //Given
        //creating TaskList of "to do's"
        TasksList listToDo = new TasksList("To Do Tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listToDo.getTasks().add(new Task("'To do' task number " + n)));

        //creating TaskList of in progress
        TasksList listInProgress = new TasksList("Progressing Tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listInProgress.getTasks().add(new Task("Progressing task number " + n)));

        //creating TaskList of completed tasks
        TasksList listDone = new TasksList("Completed Tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listDone.getTasks().add(new Task("Completed task number " + n)));

        //creating the board and assigning the lists
        Board board = new Board("Project number 1");
        board.getTasksList().add(listToDo);
        board.getTasksList().add(listInProgress);
        board.getTasksList().add(listDone);

        //making a shallow clone of object board
        Board cloneBoard = null;
        try {
            cloneBoard = board.shallowCopy();
            cloneBoard.setName("Project Number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of the object board
        Board deepCloneBoard = null;
        try {
            deepCloneBoard = board.deepCopy();
            deepCloneBoard.setName("Project number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        board.getTasksList().remove(listDone); //with use of shallow clone if we change source object, the cloned one will be changed as well - shallow clone still directs to the same HashCode..


        //Then
        System.out.println(board);
        System.out.println(cloneBoard);
        System.out.println(deepCloneBoard);
        Assert.assertEquals(2, board.getTasksList().size());
        Assert.assertEquals(2, cloneBoard.getTasksList().size());
        Assert.assertEquals(3, deepCloneBoard.getTasksList().size());
        Assert.assertEquals(cloneBoard.getTasksList(), board.getTasksList());
        Assert.assertNotEquals(deepCloneBoard.getTasksList(), board.getTasksList());

    }
}

package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String TODO = "To Do list";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(TODO, "Some example of a description");
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readTaskList = taskListDao.findByListName(listName);

        //Then
        int id = readTaskList.get(0).getId();
        Assert.assertEquals(TODO, readTaskList.get(0).getListName());

        //Clean-up
        taskListDao.delete(id);
    }
}

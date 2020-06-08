package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        TaskList toDoList = (TaskList) context.getBean("toDoList");
        toDoList.getTasks().add("Learning");
        TaskList inProgressList = (TaskList) context.getBean("inProgressList");
        inProgressList.getTasks().add("Programming");
        TaskList doneList = (TaskList) context.getBean("doneList");
        doneList.getTasks().add("Reading");
        Board board = context.getBean(Board.class);
        //Then
        System.out.println(board.getToDoList());
        Assert.assertEquals("Learning", board.getToDoList().getTasks().get(0));
        System.out.println(board.getInProgressList());
        Assert.assertEquals("Programming", board.getInProgressList().getTasks().get(0));
        System.out.println(board.getDoneList());
        Assert.assertEquals("Reading", board.getDoneList().getTasks().get(0));
    }
}



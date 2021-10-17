package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        TaskList toDoList = (TaskList) context.getBean("toDoList");
        TaskList inProgressList = (TaskList) context.getBean("inProgressList");
        TaskList doneList = (TaskList) context.getBean("doneList");
        //When
        board.addTaskToList(toDoList, "Task to do 1");
        board.addTaskToList(toDoList, "Task to do 2");
        board.addTaskToList(inProgressList, "Task in progress 1");
        board.addTaskToList(inProgressList, "Task in progress 2");
        board.addTaskToList(doneList, "Done task 1");
        board.addTaskToList(doneList, "Done task 2");
        //Then
        System.out.println("Tasks to do: ");
        board.getTasksFromList(toDoList);
        System.out.println("Tasks in progress: ");
        board.getTasksFromList(inProgressList);
        System.out.println("Done tasks: ");
        board.getTasksFromList(doneList);
    }
}

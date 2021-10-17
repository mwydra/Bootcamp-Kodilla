package com.kodilla.spring.portfolio;

public class Board {
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void addTaskToList(TaskList list, String task) {
        list.addTask(task);
    }

    public void getTasksFromList(TaskList list) {
        list.getTasks().stream()
                .forEach(System.out::println);
    }
}

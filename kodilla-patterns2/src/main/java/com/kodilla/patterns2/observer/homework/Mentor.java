package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String username;
    private int tasksCompleted;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(StudentTasks studentTasks) {
        System.out.println(username + ": New task to check: " + studentTasks.getName());
        tasksCompleted++;
    }

    public String getUsername() {
        return username;
    }

    public int getTasksCompleted() {
        return tasksCompleted;
    }
}

package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String username;
    private int tasksChecked;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(StudentTasks studentTasks) {
        System.out.println(username + ": New task to check from student: " + studentTasks.getStudent().getStudentName());
        tasksChecked++;
    }

    public int getTasksChecked() {
        return tasksChecked;
    }
}

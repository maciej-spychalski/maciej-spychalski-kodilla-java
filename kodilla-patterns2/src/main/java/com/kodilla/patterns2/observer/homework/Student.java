package com.kodilla.patterns2.observer.homework;

public class Student {
    private String studentName;
    private StudentTasks studentTasks;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public StudentTasks getStudentTasks() {
        return studentTasks;
    }

    public void setStudentTasks(StudentTasks studentTasks) {
        this.studentTasks = studentTasks;
    }
}

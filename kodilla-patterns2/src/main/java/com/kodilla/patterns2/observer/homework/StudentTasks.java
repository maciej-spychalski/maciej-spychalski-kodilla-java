package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class StudentTasks implements Observable {
    private final List<Observer> observers;
    private final List<String> tasks;
    private final Student student;

    public StudentTasks(Student student) {
        observers = new ArrayList<>();
        tasks = new ArrayList<>();
        this.student = student;
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public Student getStudent() {
        return student;
    }
}

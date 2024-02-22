package com.tawsif.rahman;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<Task> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public void markTaskCompleted(String title) {
        for (Task task : tasks) {
            if (task.getTitle().equals(title)) {
                task.setCompleted(true);
                return;
            }
        }
        System.out.println("Task with title \"" + title + "\" not found.");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Task task : tasks) {
            builder.append(task).append("\n");
        }
        return builder.toString();
    }
}

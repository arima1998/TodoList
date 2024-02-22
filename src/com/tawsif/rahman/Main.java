package com.tawsif.rahman;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        Scanner scanner = new Scanner(System.in);
        // Add some tasks
        todoList.addTask(new Task("Buy groceries", "Milk, bread, eggs"));
        todoList.addTask(new Task("Finish report", ""));

        // Print the list
        System.out.println("Todo List:");
        System.out.println(todoList);

        // Mark a task completed
        todoList.markTaskCompleted("Buy groceries");

        // Print the updated list
        System.out.println("\nUpdated List:");
        System.out.println(todoList);

        Task newAdd = new Task();
        System.out.println("ADD NEW TASK: ");
        System.out.print("Title: ");
        String title = scanner.nextLine();
        newAdd.setTitle(title);
        System.out.print("Description: ");
        String desc = scanner.nextLine();
        newAdd.setDescription(desc);
        todoList.addTask(newAdd);

        System.out.println("Todo List:");
        System.out.println(todoList);




    }
}
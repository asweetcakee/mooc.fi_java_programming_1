
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mefferio
 */
public class UserInterface {

    private TodoList todoList;
    private Scanner scanner;
    private final String STOP_COMMAND = "stop";
    private final String ADD_COMMAND = "add";
    private final String LIST_COMMAND = "list";
    private final String REMOVE_COMMAND = "remove";

    public UserInterface(TodoList todolist, Scanner scanner) {
        this.todoList = todolist;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {

            System.out.println("Command: ");
            String input = scanner.nextLine().trim();

            if (input.equals(STOP_COMMAND)) {
                break;
            }

            switch (input) {
                case ADD_COMMAND:
                    addTask();
                    break;
                case LIST_COMMAND:
                    printTasks();
                    break;
                case REMOVE_COMMAND:
                    removeTask();
                    break;
                default:
                    System.out.println("Unknown command");
                    break;
            }
        }

        scanner.close();
    }

    private void addTask() {
        System.out.println("To add: ");
        String task = scanner.nextLine().trim();

        this.todoList.add(task);

    }

    private void printTasks() {
        this.todoList.print();
    }

    private void removeTask() {
        System.out.println("Which one is removed? ");

        if (scanner.hasNextInt()) {
            int taskNumber = scanner.nextInt();
            scanner.nextLine();

            todoList.remove(taskNumber);
        } else {
            System.out.println("Invalid task number.");
            scanner.nextLine();
        }
    }

}

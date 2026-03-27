import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // clear buffer

                if (choice == 1) {
                    System.out.print("Enter task: ");
                    String task = scanner.nextLine();
                    if (task.trim().isEmpty()) {
                        System.out.println("Task cannot be empty!");
                    } else {
                        tasks.add(task);
                        System.out.println("Task added successfully!");
                    }
                } 
                
                else if (choice == 2) {
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to display.");
                    } else {
                        System.out.println("\nTasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                } 
                
                else if (choice == 3) {
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to delete.");
                    } else {
                        System.out.println("\nTasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                        System.out.print("Enter task number to delete: ");
                        try {
                            int taskNum = scanner.nextInt();
                            scanner.nextLine();
                            if (taskNum > 0 && taskNum <= tasks.size()) {
                                tasks.remove(taskNum - 1);
                                System.out.println("Task deleted successfully!");
                            } else {
                                System.out.println("\nInvalid task number.");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Please enter a valid number!");
                            scanner.nextLine();
                        }
                    }
                } 
                
                else if (choice == 4) {
                    System.out.println("Exiting program. Goodbye!");
                    break;
                } 
                
                else {
                    System.out.println("Invalid choice.");
                }
            } 
            
            catch (InputMismatchException e) {
                System.out.println("Please enter a valid number!");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}
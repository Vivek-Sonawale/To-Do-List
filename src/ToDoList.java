import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<String> tasks = new ArrayList<String>();

    public static void main(String[] args) {

        while (true) {
            menu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    removeTask();
                    break;
                case 3:
                    viewTask();
                    break;
                case 4:
                    exit();
                    break;
            }
        }

    }

    public static void menu() {
        System.out.println("Welcome to ToDoList ---->");
        System.out.println("Press 1 to Add the task");
        System.out.println("Press 2 to Remove the Task");
        System.out.println("Press 3 to View the Task");
        System.out.println("Press 4 to Exit the Application");
        System.out.println("Enter your Choice::");
    }

    public static void addTask() {
        System.out.println("Enter the Task:");
        String newTask = sc.nextLine();
        tasks.add(newTask);
        System.out.println("New Task Added!");
    }

    public static void removeTask() {
        System.out.println("Enter the Task Number :");
        int removeNumber = sc.nextInt();
        if (removeNumber > 0 && removeNumber <= tasks.size()) {
            tasks.remove(removeNumber - 1);
            System.out.println("Task Removed successfully!");
        } else {
            System.out.println("Invalid task number!");
        }
    }

    public static void viewTask() {
        if (tasks.isEmpty()) {
            System.out.println("No Task Available");
        } else {
            for (String value : tasks) {
                System.out.println(value);
            }
        }
    }

    public static void exit() {
        System.exit(0);
    }
}
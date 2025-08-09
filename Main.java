import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDoList todo = new ToDoList();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add task");
            System.out.println("2. Delete task");
            System.out.println("3. View all tasks");
            System.out.println("4. Search task");
            System.out.println("5. Count tasks");
            System.out.println("6. Insert task at index");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter task title: ");
                    todo.addTask(sc.nextLine());
                }
                case 2 -> {
                    System.out.print("Enter task title to delete: ");
                    System.out.println(todo.deleteTask(sc.nextLine()) ? "Task deleted!" : "Task not found.");
                }
                case 3 -> todo.printTasks();
                case 4 -> {
                    System.out.print("Enter task title to search: ");
                    System.out.println(todo.contains(sc.nextLine()) ? "Task exists!" : "Not found.");
                }
                case 5 -> System.out.println("Total tasks: " + todo.countTasks());
                case 6 -> {
                    System.out.print("Enter index: ");
                    int idx = Integer.parseInt(sc.nextLine());
                    System.out.print("Enter task title: ");
                    todo.insertTaskAt(idx, sc.nextLine());
                }
                case 7 -> System.out.println("Exiting... Goodbye!");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 7);
    }
}

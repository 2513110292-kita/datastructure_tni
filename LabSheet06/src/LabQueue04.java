import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LabQueue04 {
    private static Queue<String> q_printer = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void addFile() {
        System.out.print("\nEnter a file name: ");
        String fileName = scanner.nextLine();
        q_printer.add(fileName);
        System.out.println("\nPrinter queue => " + q_printer);
    }

    public static void viewNextFile() {
        System.out.println();
        if (!q_printer.isEmpty()) {
            System.out.println("View: " + q_printer.peek());
            System.out.println("\nPrinter queue => " + q_printer);
        } else {
            System.out.println("No file in queue");
        }
    }

    public static void printFile() {
        System.out.println();
        if (!q_printer.isEmpty()) {
            System.out.println("Printing: " + q_printer.poll());
            if (!q_printer.isEmpty()) {
                System.out.println("Printer queue => " + q_printer);
            } else {
                System.out.println("No file in queue");
            }
        } else {
            System.out.println("No file in queue");
        }
    }

    public static void main(String[] args) {
        int option = 0;

        while (option != 4) {
            System.out.println("\nPress 1 Add a file to the queue");
            System.out.println("Press 2 View the file");
            System.out.println("Press 3 Print the file");
            
            System.out.print("\nEnter an option: ");
            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
                scanner.nextLine();

                switch (option) {
                    case 1:
                        addFile();
                        break;
                    case 2:
                        viewNextFile();
                        break;
                    case 3:
                        printFile();
                        break;
                    case 4:
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Invalid option! Try again.");
                }
            } else {
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
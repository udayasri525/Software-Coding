package com.packages;

import java.util.Scanner;

class StockHandler {
    protected String handlerName;
    protected String handlerId;

    public StockHandler(String handlerName, String handlerId) {
        this.handlerName = handlerName;
        this.handlerId = handlerId;
    }
}

class StockPerformance extends StockHandler {

    private int totalStock = 0;
    private int entryCount = 0;
    private double averageStock = 0.0;
    private String grade = "Not Calculated";

    public StockPerformance(String handlerName, String handlerId) {
        super(handlerName, handlerId);
        System.out.println("Stock Performance Profile Created");
    }

    // Add Stock Entry
    public void addStock(int quantity) {
        if (quantity <= 0) {
            System.out.println("Invalid quantity! Please enter positive value.");
        } else {
            totalStock += quantity;
            entryCount++;
            System.out.println("Stock added successfully.");
        }
    }

    // Recalculate Result
    public void calculatePerformance() {
        if (entryCount == 0) {
            System.out.println("No stock entries to calculate.");
            return;
        }

        averageStock = (double) totalStock / entryCount;

        if (averageStock >= 50) {
            grade = "Efficient";
        } else if (averageStock >= 30) {
            grade = "Average";
        } else {
            grade = "Poor";
        }

        System.out.println("Performance recalculated successfully.");
    }

    // View Summary
    public void viewSummary() {
        System.out.println("\nStock Performance Summary");
        System.out.println("Handler Name: " + handlerName);
        System.out.println("Handler ID: " + handlerId);
        System.out.println("Total Stock Handled: " + totalStock);
        System.out.println("Average Stock Per Entry: " + averageStock);
        System.out.println("Handling Grade: " + grade);
    }
}

public class WarehouseSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Handler Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Handler ID: ");
        String id = sc.nextLine();

        StockPerformance sp = new StockPerformance(name, id);

        int choice;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add Stock");
            System.out.println("2. Recalculate Result");
            System.out.println("3. View Summary");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Stock Quantity: ");
                    int qty = sc.nextInt();
                    sp.addStock(qty);
                    break;

                case 2:
                    sp.calculatePerformance();
                    break;

                case 3:
                    sp.viewSummary();
                    break;

                case 4:
                    System.out.println("Program exited. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}


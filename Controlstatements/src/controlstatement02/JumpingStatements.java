package controlstatement02;

import java.util.Scanner;

public class JumpingStatements {
    public static void main(String[] args) {
    	//TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===Drinking Water+ Reminder ===");
        System.out.print("How many glasses of water have you drunk today? ");
        int glasses = scanner.nextInt();
        
        for (int i = 1; i <= 8; i++) {
            if (i > glasses) {
                System.out.println("You need to drink " + (8 - glasses) + " more glasses today!");
                break;
            }
            System.out.println("Glass " + i + " - Good job!");
        }

        System.out.println("\n=== Daily Tasks Checklist ===");
        System.out.println("Enter your completed tasks (max 5):");
        scanner.nextLine();
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Task " + i + ": ");
            String task = scanner.nextLine();
            
            if (task.equalsIgnoreCase("skip")) {
                System.out.println("Skipping this task...");
                continue;
            }
            
            System.out.println("Added: " + task + " to your completed tasks!");
        }

        System.out.println("\n=== Study Session ===");
        int minutesStudied = 0;
        while (true) {
            System.out.print("Have you studied for 30 minutes? (yes/no): ");
            String answer = scanner.next();
            
            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("Great job! You studied for " + (minutesStudied + 30) + " minutes.");
                break;
            }
            
            minutesStudied += 30;
            System.out.println("Added 30 more minutes. Total: " + minutesStudied + " minutes.");
        }

        scanner.close();
    }
}


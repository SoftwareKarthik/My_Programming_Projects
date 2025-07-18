package controlstatement;
import java.util.Scanner;

public class ControlStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if(num <= 10) {
            System.out.println("if block is satisfied");
        }
        
        System.out.print("Enter two  numbers: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        if(a % 2 == 0) {
            System.out.println("Even number: " + a);
        } else {
            System.out.println("Odd number: " + a);
        }
        
        System.out.print("Enter three numbers: ");
        double a1 = sc.nextDouble();
        double b1 = sc.nextDouble();
        double c1 = sc.nextDouble();
        
        if(a1 > b1) {
            if(a1 > c1) {
                System.out.println("Greatest number: " + a1);
            } else {
                System.out.println("Greatest number: " + c1);
            }
        } else {
            if(b1 > c1) {
                System.out.println("Greatest number: " + b1);
            } else {
                System.out.println("Greatest number: " + c1);
            }
        }
        
        System.out.println("Performing Switch Case:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();
        
        System.out.print("Enter two numbers for operations: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        
        switch(choice) {
            case 1:
                System.out.println("Addition : " + (x + y));
                break;
            case 2:
                System.out.println("Subtraction : " + (x - y));
                break;
            case 3:
                System.out.println("Multiplication : " + (x * y));
                break;
            case 4:
                if(y != 0) {
                    System.out.println("Division : " + (x / y));
                } else {
                    System.out.println("Error: Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }
        
    }
}
package controlstatement01;
import java.util.Scanner;

public class Iteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
        
        // WHILE LOOP (Sum of digits)
        System.out.print("Enter a number for digit sum: ");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        while(temp != 0) {
            sum = sum+temp % 10;
            temp /= 10;
        }
        System.out.println("Sum of digits : " + sum);
        
        // 2. FOR LOOP (Factorial)
        System.out.print("Enter a number for factorial: ");
        int n = sc.nextInt();
        int factorial = 1;
        for(int i = 1; i <= n; i++) {
            factorial = factorial* i;
        }
        System.out.println("Factorial: " + factorial);
        
        // 3. DO-WHILE LOOP (Number guessing game)
        int secretNumber = 1000;
        int guess;
        int attempts = 0;
        System.out.println("Guess the number (1-100):");
        do {
            guess = sc.nextInt();
            attempts++;
            if(guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if(guess > secretNumber) {
                System.out.println("Too high! Try again.");
            }
        } while(guess != secretNumber);
        System.out.println("Correct! Attempts: " + attempts);
        

	}

}

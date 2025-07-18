package nonprimitive;
import java.util.Scanner;

public class NonPrimitive {
    public static void main(String[] args) {
        String txt = "Hello World";
        System.out.println("Text: " + txt);
        
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[10];
        
        System.out.println("Enter 10 marks:");
        
        for(int i = 0; i < 10; i++) {
            marks[i] = sc.nextInt();
        }
        
        System.out.println("\nEntered marks:");
        
        for(int i = 0; i < 10; i++) {
            System.out.println("Mark " + (i+1) + ": " + marks[i]);
        }
        
    }
}
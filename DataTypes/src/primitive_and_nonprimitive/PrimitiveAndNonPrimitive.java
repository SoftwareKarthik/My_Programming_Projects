package primitive_and_nonprimitive;
import java.util.Scanner;

public class PrimitiveAndNonPrimitive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();
        sc.nextLine();

        String[] names = new String[numStudents];
        double[] marks = new double[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter student Details " + (i + 1) + ":");
            System.out.print("Name: ");
            names[i] = sc.nextLine();
            System.out.print("Marks: ");
            marks[i] = sc.nextDouble();
            sc.nextLine();
        }

        System.out.println("\nStudent Rankings:");
        System.out.println("Name\t\tMarks");
        
        for (int i = 0; i < numStudents; i++) {
        	System.out.println(names[i]  + "\t\t" + marks[i]);
        }


	}

}

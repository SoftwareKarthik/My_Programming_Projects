package primitive;
import java.util.Scanner;
public class PrimitiveTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
		        
		        System.out.print("Enter a byte value (-128 to 127): ");
		        byte byteValue = sc.nextByte();
		        System.out.print("Enter a short value (-32768 to 32767): ");
		        
		        short shortValue = sc.nextShort();
		        System.out.print("Enter an integer value: ");
		        int intValue = sc.nextInt();
		     
		        System.out.print("Enter a long value: ");
		        long longValue = sc.nextLong();
		        
		        System.out.print("Enter a float value: ");
		        float floatValue = sc.nextFloat();
		        
		        System.out.print("Enter a double value: ");
		        double doubleValue = sc.nextDouble();
		        
		        System.out.print("Enter a boolean value (true/false): ");
		        boolean booleanValue = sc.nextBoolean();
		        
		        System.out.print("Enter a single character: ");
		        char charValue = sc.next().charAt(0);
		        
		        sc.nextLine();
		        System.out.println("\n Enter values:");
		        System.out.println("Byte: " + byteValue);
		        System.out.println("Short: " + shortValue);
		        System.out.println("Int: " + intValue);
		        System.out.println("Long: " + longValue);
		        System.out.println("Float: " + floatValue);
		        System.out.println("Double: " + doubleValue);
		        System.out.println("Boolean: " + booleanValue);
		        System.out.println("Char: " + charValue);
		        
		    }
		

	}



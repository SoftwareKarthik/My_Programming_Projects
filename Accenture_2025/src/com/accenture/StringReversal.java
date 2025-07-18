//string reversal:

package com.accenture;
import java.util.Scanner;
public class StringReversal {
    public static String reverseString(String s) {
        String reversed_str = "";
        for (int i = 0; i < s.length(); i++) {
            reversed_str = s.charAt(i) + reversed_str;
        }
        return reversed_str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();
        
        System.out.println("Reversed string: " + reverseString(input));
        
    }  
}

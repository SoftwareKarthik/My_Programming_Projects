package com.strings;
import java.util.*;

public class Palindrome {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a string to check if it's a palindrome: ");
    String inputString = scanner.nextLine();

    System.out.println(isPalindrome(inputString));

    scanner.close();
}
public static boolean isPalindrome(String str) {
    // Create a StringBuilder object from the input string
    StringBuilder reversedStrBuilder = new StringBuilder(str);

    // Reverse the StringBuilder
    reversedStrBuilder.reverse();

    // Convert the reversed StringBuilder back to a String
    String reversedStr = reversedStrBuilder.toString();

    // Compare the original string with the reversed string

    return str.equals(reversedStr);
}
}
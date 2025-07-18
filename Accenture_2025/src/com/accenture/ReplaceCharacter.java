//ReplaceCharacter

package com.accenture;

import java.util.Scanner;

public class ReplaceCharacter {
    
    // This method swaps all occurrences of ch1 with ch2 and vice versa
    public static String replaceCharacter(String str, char ch1, char ch2) {
        char[] result = str.toCharArray();
        for (int i = 0; i < result.length; i++) {
            if (result[i] == ch1) {
                result[i] = ch2;
            } else if (result[i] == ch2) {
                result[i] = ch1;
            }
        }
        return new String(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        System.out.print("Enter first character to replace: ");
        char ch1 = sc.next().charAt(0);
        
        System.out.print("Enter second character to swap with: ");
        char ch2 = sc.next().charAt(0);

        String output = replaceCharacter(input, ch1, ch2);
        System.out.println("Modified string: " + output);

        sc.close();
    }
}

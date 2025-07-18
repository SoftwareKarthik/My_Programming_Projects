package com.accenture;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseWords {
    public static void reverseWords(String sentence) {
        String result = "";
        List<String> stack = new ArrayList<>();
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                stack.add(result);   // Add word
                stack.add(" ");      // Add space as is
                result = "";         // Reset for next word
            } else {
                result += sentence.charAt(i);  // Keep building the word
            }
        }

        stack.add(result); // Add the final word

        // Print in reverse order
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.print(stack.get(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputStr = sc.nextLine();
        reverseWords(inputStr);
        sc.close();
    }
}


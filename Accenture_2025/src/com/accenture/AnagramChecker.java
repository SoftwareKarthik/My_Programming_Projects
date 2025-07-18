package com.accenture;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static String areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return "no";
        }
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2) ? "yes" : "no";
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st string: ");
		String str1 = sc.nextLine();
		System.out.print("Enter 2nd string: ");
		String str2 = sc.nextLine();
        System.out.println(areAnagrams(str1, str2));
    }
}

package com.coding.interview.numbers;
import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number:");
		int number;
		Scanner sc=new Scanner(System.in);
		number = sc.nextInt();
		int temp = number;
		int reversenumber = 0;
		if(number<=0)
			System.out.println("Enter a number greater than 0");
		while(temp>0) {
			int digit=temp%10;
			reversenumber=reversenumber*10+digit;
			temp = temp /10;
		}
		if(reversenumber==number)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("NotPalindrome");
		}

	}

}

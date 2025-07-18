package com.coding.interview.numbers;
import java.util.Scanner;

public class FibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		int a=0 , b=1;
		int c;
		for(int i=1; i<=number; i++)
		{
			System.out.println(a);
		    c=a+b;
		    a=b;
		    b=c;
		}
	}
}

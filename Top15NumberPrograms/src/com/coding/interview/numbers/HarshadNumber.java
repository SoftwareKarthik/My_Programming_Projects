package com.coding.interview.numbers;
import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number :");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int temp=number;
		int sum=0;
		if(number<=0)
			System.out.println("Enter a number greater than 0");
		while(temp>0)
		{
			int digit=temp%10;
			sum=sum+digit;
			temp=temp/10;
		}
		if((number%sum)==0)
			System.out.println("Harshad Number");
		else
			System.out.println("Not a Harshad Number");
		

	}

}

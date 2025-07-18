package com.coding.interview.numbers;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		int flag=0;
		if(number==0 || number == 1)
		{
			System.out.println("Prime number starts from 2");
		}
		else {
			int MiddleNumber = number/2;
			for(int i=2; i<=MiddleNumber; i++)
			{
				if(number%2==0)
				{
					System.out.println(number + " is not a PrimeNumber");
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(number + " is  a PrimeNumber");
			}
		}
		
		
		

	}

}

package com.coding.interview.numbers;
import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number:");
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		int temp=num;
		int sum=0;
		while(temp>0) 
		{
			int fact=1;
			int digit=temp%10;
			for(int i=1; i<=digit; i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			temp=temp/10;
		}
		if(sum==num)
			System.out.println("Strong Number");
		else
			System.out.println("Not a Strong Number");
	}
}

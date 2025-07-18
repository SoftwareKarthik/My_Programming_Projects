package com.coding.interview.numbers;
import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number :");
		Scanner sc = new Scanner(System.in);
		int number=sc.nextInt();
		int temp=number;
		int flag=0;
		int square = (temp*temp);
		while(temp>0) {
			int digit=temp%10;
			int d1=square%10;
			if(digit!=d1) {
				flag++;
			}
			temp=temp/10;
			square=square/10;
		}
		if(flag==0)
		{
			System.out.println("Automorphic Number");
		}
		else {
			System.out.println("Not Automorphic Number");
		}
		

	}

}

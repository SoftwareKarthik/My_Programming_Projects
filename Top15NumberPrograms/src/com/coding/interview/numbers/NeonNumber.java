package com.coding.interview.numbers;
import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number :");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		if (number <= 0) 
		{ 
            System.out.println("Number must be greater than 0.");
        }
		int square = (number*number);
		int temp=square;
		int sum=0;
		while(temp>0) {
			int digit=temp%10;
			sum=sum+digit;
			temp=temp/10;
		}
		if(sum==number) {
			System.out.println("Neon Number");
		}
		else {
			System.out.println("Not a Neon Number");
		}

	}

}

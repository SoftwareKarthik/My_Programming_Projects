package com.coding.interview.numbers;
import java.util.Scanner;

public class SmithNumber {

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
		int sum = 0;
        int temp = number;
        while (temp > 0) {
            int digit=temp%10;
            sum=sum+digit;
            temp=temp/10;
            
        }
     //Find prime factors and sum their digits
        int sumFactorDigits = 0;
        temp = number;
        // Check for factor 2
        while (temp % 2 == 0) {
            sumFactorDigits += 2; 
            temp /= 2;
        }
       // Check for odd factors (3,5,7,...)
        for (int i = 3; i <= temp; i += 2) {
            while (temp % i == 0) {
                int factor = i;
                while (factor > 0) {
                    sumFactorDigits += factor % 10; 
                    factor /= 10;
                }
                temp /= i;
            }
        }
        if (sum == sumFactorDigits) {
            System.out.println("Smith number");
        } else {
            System.out.println("NOT a Smith number.");
        }

	}

}

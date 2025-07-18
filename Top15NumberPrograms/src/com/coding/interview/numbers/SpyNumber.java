package com.coding.interview.numbers;
import java.util.Scanner;
public class SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int temp=number;
        int sum = 0 , prod=1;
        while(temp > 0) {
            int digit = temp % 10;
            sum = sum+digit;
            prod=prod*digit;
            temp = temp / 10;
        }
        
        if(sum == prod) {
            System.out.println("Spy Number");
        } 
        else {
            System.out.println("Not a Spy Number");
        }

	}

}

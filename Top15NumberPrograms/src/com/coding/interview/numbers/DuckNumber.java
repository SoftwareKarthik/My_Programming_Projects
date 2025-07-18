package com.coding.interview.numbers;
import java.util.Scanner;
public class DuckNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int temp = number;
        int count=0;
        while(temp > 0) {
            int digit = temp % 10;
            if(digit==0)
            	count++;
            temp = temp / 10;
        }
        if(count>0) {
            System.out.println("Zero Number");
        } 
        else {
            System.out.println("Not a Zero Number");
        }

	}

}

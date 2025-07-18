package com.coding.interview.numbers;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0;
        int temp = number;
        int numberOfDigits = String.valueOf(number).length();
        
        while(number > 0) {
            int digit = number % 10;
            sum = (int) (sum + Math.pow(digit, numberOfDigits));
            number = number / 10;
        }
              
        if(sum == temp) {
            System.out.println(temp + " is a Armstrong Number");
        } 
        else {
            System.out.println(temp + " is Not a Armstrong Number");
        }
    }
}
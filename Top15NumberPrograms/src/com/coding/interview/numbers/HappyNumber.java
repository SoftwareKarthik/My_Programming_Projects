package com.coding.interview.numbers;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number :");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int temp=number;
		Set<Integer> seenNumbers = new HashSet<>();
		//(HashSet and Set for cycle detection)
		while (temp != 1 && !seenNumbers.contains(temp)) 
			//temp != 1: Keep going until we reach 1 (happy number)

            //!seenNumbers.contains(temp): Stop if we see a number we've processed before (cycle = not happy)
		{
            seenNumbers.add(temp);
            int sum=0;
//Without Reset:

//First iteration: Processes 19 → sum = 1² + 9² = 82

//Second iteration: sum still 82 → adds 8² + 2² = 64+4=68 → sum=82+68=150 (WRONG)

//With Proper Reset:

//First iteration: sum=0 → processes 19 → 1+81=82

//Second iteration: sum=0 → processes 82 → 64+4=68 (CORRECT)
		    while(temp>0) {
			    int digit=temp%10;
			    sum=sum+(digit*digit);
			    temp=temp/10;
		    }
		    temp=sum;
		}
		if(temp==1) {
			System.out.println("Happy Number");
		}
		else {
			System.out.println("Not a Happy Number");
		}
	}
}
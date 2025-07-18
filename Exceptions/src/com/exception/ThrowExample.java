package com.exception;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int age = 16;

		        if (age < 18) {
		            // manually throw exception
		            throw new ArithmeticException("You are not eligible to vote.");
		        }

		        System.out.println("You are eligible to vote.");
		    }


	}

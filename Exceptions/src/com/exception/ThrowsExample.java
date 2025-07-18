package com.exception;

public class ThrowsExample {

		// TODO Auto-generated method stub
		// Step 1: Define a method that throws exception

		    public static void checkAge(int age) throws Exception {
		        if (age < 18) {
		            throw new Exception("Age must be 18 or older.");
		        } else {
		            System.out.println("You can vote!");
		        }
		    }

		    // Step 2: Handle the exception where method is called
		    public static void main(String[] args) {
		        try {
		            checkAge(15);
		        } catch (Exception e) {
		            System.out.println("Exception: " + e.getMessage());
		        }
		    }

	}


package com.exception;

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        try {
		            int result = 10 / 0;
		            System.out.println("Result: " + result);
		        } catch (ArithmeticException e) {
		            System.out.println("Exception: " + e);
		        }
		    }

}

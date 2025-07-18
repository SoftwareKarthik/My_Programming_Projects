package com.exception;

// Step 1: Create a custom exception class
class NegativeException extends Exception {
    int age;

    NegativeException(int age) {
        this.age = age;
    }

    public String toString() {
        return "Age can't be negative: " + age;
    }
}

public class Userdefined {

    // Method that throws the custom exception
    static void demo() throws NegativeException {
        int age = -5;

        if (age < 0) {
            throw new NegativeException(age); 
        } else {
            System.out.println("Age is: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            demo();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

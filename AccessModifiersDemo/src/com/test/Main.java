package com.test;

import com.animals.Animal;
import com.animals.Vehicle;
import com.bank.BankAccount;

public class Main {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        // Testing PUBLIC access
        System.out.println("=== Testing PUBLIC ===");
        Animal animal = new Animal();
        System.out.println("Animal name: " + animal.name);
        animal.eat();

        // Testing PROTECTED access through public method
        System.out.println("\n=== Testing PROTECTED ===");
        Vehicle vehicle = new Vehicle();
        vehicle.displayVehicleInfo(); // Uses public method to access protected members

        // Testing PROTECTED through inheritance
        System.out.println("\n=== Testing PROTECTED via inheritance ===");
        Car car = new Car();
        car.showProtectedMembers(); // Access through subclass method

        // Testing PRIVATE access
        System.out.println("\n=== Testing PRIVATE ===");
        BankAccount account = new BankAccount();
        account.displayBalance(); // Uses public method to access private members
    }
}

class Car extends Vehicle {
    public void showProtectedMembers() {
        System.out.println("Car model: " + model); // Can access protected field
        start(); // Can access protected method
    }
}
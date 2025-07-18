package com.animals;

public class Vehicle {
    protected String model = "Tesla";
    
    protected void start() {
        System.out.println("Starting...");
    }
    
    // Public method to access protected functionality
    public void displayVehicleInfo() {
        System.out.println("Model: " + model);
        start();
    }
}
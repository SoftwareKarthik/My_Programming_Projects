package com.bank;

public class BankAccount {
    private double balance = 1000.0;
    
    private void showBalance() {
        System.out.println("Current balance: " + balance);
    }
    
    public void displayBalance() {
        showBalance(); // Public method accessing private method
    }
}
package com.objectmethods;

import java.util.Objects;

// Laptop class implements Cloneable to support object cloning
class Laptop implements Cloneable {
    String model;
    int price;

    // Constructor to initialize Laptop objects
    public Laptop(String model, int price) {
        this.model = model;
        this.price = price;
    }

    // toString() gives a readable string of object
    @Override
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }

    // equals() compares object data logically
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Laptop other = (Laptop) obj;
        return price == other.price && Objects.equals(model, other.model);
    }

    // hashCode() returns value based on model and price
    @Override
    public int hashCode() {
        return Objects.hash(model, price);
    }

    // clone() method to copy object
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {

        Laptop laptop1 = new Laptop("Dell", 1000);
        Laptop laptop2 = new Laptop("Lenovo Yoga", 1000);
        Laptop laptop3 = new Laptop("Dell Inspiron", 850);

        // Using toString()
        System.out.println("toString(): " + laptop1);

        // Using equals() to compare
        System.out.println("laptop1 equals laptop2? " + laptop1.equals(laptop2));
        System.out.println("laptop1 equals laptop3? " + laptop1.equals(laptop3));

        // Using hashCode()
        System.out.println("laptop1 hashCode: " + laptop1.hashCode());
        System.out.println("laptop2 hashCode: " + laptop2.hashCode());
        System.out.println("laptop3 hashCode: " + laptop3.hashCode());

        // Using getClass()
        System.out.println("Class of laptop1: " + laptop1.getClass());

        // Cloning laptop1 to create a copy
        Laptop clonedLaptop = (Laptop) laptop1.clone();
        System.out.println("Cloned Laptop: " + clonedLaptop);
        System.out.println("laptop1 equals clonedLaptop? " + laptop1.equals(clonedLaptop));
    }
}

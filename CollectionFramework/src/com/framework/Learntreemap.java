package com.framework;
import java.util.*;

public class Learntreemap {

    public static void main(String[] args) {
        // TreeMap maintains sorted order based on keys (alphabetical for String keys)
        Map<String, Integer> numbers = new TreeMap<>();

        // Adding key-value pairs
        numbers.put("Karthik", 42);
        numbers.put("Akki", 40);
        numbers.put("Vikas", 37);
        numbers.put("Kala", 47);
        numbers.put("Yaswanth", 41);

        System.out.println("Map: " + numbers);  // Sorted map

        // Removing an entry by key (e.g., remove "Vikas")
        numbers.remove("Vikas"); 

        System.out.println("Map after removing 'Vikas': " + numbers);

        // Checking if value exists
        System.out.println("Contains value 40? " + numbers.containsValue(40));

        // Check if map is empty
        System.out.println("Is the map empty? " + numbers.isEmpty());

        // Iterating using entrySet
        for (Map.Entry<String, Integer> e : numbers.entrySet()) {
            System.out.println("Entry: " + e);
            System.out.println("Key: " + e.getKey());
            System.out.println("Value: " + e.getValue());
        }
    }
}

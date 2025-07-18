package com.framework;
import java.util.*;

public class Learnmap {

    public static void main(String[] args) {
        Map<String, Integer> numbers = new HashMap<>();

        // Adding key-value pairs
        numbers.put("Karthik", 42);
        numbers.put("Akki", 40);
        numbers.put("Vikas", 37);
        numbers.put("Kala", 47);
        numbers.put("Yaswanth", 41);

        System.out.println("Map: " + numbers);
        System.out.println("ContainsValue: " + numbers.containsValue(40));
        System.out.println("Empty : " + numbers.isEmpty());
        

        // If the key doesn't exist, insert a new value
        numbers.putIfAbsent("Yaswanth", 45); // Will NOT replace existing value 41
        System.out.println("Map after putIfAbsent: " + numbers);

        // ✅ Iterating using entrySet()
        for (Map.Entry<String, Integer> e : numbers.entrySet()) {
            System.out.println("Entry: " + e);
            System.out.println("Key: " + e.getKey());
            System.out.println("Value: " + e.getValue());
        }

        // ✅ Iterating over keys
        System.out.println("Keys:");
        for (String key : numbers.keySet()) {
            System.out.println(key);
        }

        // ✅ Iterating over values
        System.out.println("Values:");
        for (Integer value : numbers.values()) {
            System.out.println(value);
        }
    }
}

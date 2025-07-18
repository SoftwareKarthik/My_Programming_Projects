package com.accenture;
import java.util.Scanner;

public class RatCountHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rats = sc.nextInt();
        int units = sc.nextInt();
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int requiredFood = rats * units;
        int currentFood = 0;
        int housesUsed = 0;

        for (int i = 0; i < n; i++) {
            currentFood += a[i];
            if (currentFood >= requiredFood) {
                housesUsed = i + 1;
                break;
            }
        }

        if (housesUsed > 0) {
            System.out.println("Number Of Houses: " + housesUsed);
        } else {
            System.out.println(0);
        }

        System.out.println("currentFood: " + currentFood);
        System.out.println("requiredFood: " + requiredFood);
    }
}

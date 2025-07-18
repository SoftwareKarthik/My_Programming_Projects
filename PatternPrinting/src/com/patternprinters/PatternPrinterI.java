package com.patternprinters;

public class PatternPrinterI {
    public static void main(String[] args) {
        for(int i=1; i<=7; i++) {
            for(int j=1; j<=3; j++) {
                if(i==1||i==7||j==2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
package com.patternprinters;

public class PatternPrinterX {
    public static void main(String[] args) {
        for(int i=1; i<=7; i++) {
            for(int j=1; j<=7; j++) {
                if(i==j || i+j==8) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
package com.patternprinters;

public class PatternPrinterY {
    public static void main(String[] args) {
        for(int i=1; i<=7; i++) {
            for(int j=1; j<=5; j++) {
                if((i==j&&i<4)||(i+j==6&&i<4)||(j==3&&i>3)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
package com.patternprinters;

public class PatternPrinterV {
    public static void main(String[] args) {
        for(int i=1; i<=7; i++) {
            for(int j=1; j<=7; j++) {
                if((j==1&&i<5)||(j==7&&i<5)||(i-j==4)||(i+j==12)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
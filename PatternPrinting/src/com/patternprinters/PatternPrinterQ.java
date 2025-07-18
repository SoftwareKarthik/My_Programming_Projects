package com.patternprinters;

public class PatternPrinterQ {
    public static void main(String[] args) {
        for(int i=1; i<=8; i++) {
            for(int j=1; j<=5; j++) {
                if((i==1&&j>1&&j<5)||(i==7&&j>1&&j<5)||(j==1&&i>1&&i<7)||(j==5&&i>1&&i<7)||(i==5&&j==3)||(i==6&&j==4)||(i==7&&j==5)||(i==8&&j==6)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
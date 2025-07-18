package com.patternprinters;

public class PatternPrinterK {
    public static void main(String[] args) {
        for(int i=1; i<=7; i++) {
            for(int j=1; j<=4; j++) {
                if(j==1 || (i==1&&j==4)||(i==2&&j==3)||(i==3&&j==2)||(i==5&&j==2)||(i==6&&j==3)||(i==7&&j==4)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
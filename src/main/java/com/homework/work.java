package com.homework;

public class work {

    public static void main(String[] args) {
        for (int x = 1; x <= 5; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print("*");
            }
           
                System.out.println(" ");
        }//x=5
        for (int x = 6; x>=1 ; x--) {//
            for (int y = 1; y<=x; y++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

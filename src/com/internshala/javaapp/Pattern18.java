package com.internshala.javaapp;

public class Pattern18 {
    static void pattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int s = 5; s >= row; s--) {

                System.out.print(" ");
            }
            for (int col = 1; col < (2 * row); col++) {
                System.out.print("*");
            }
            System.out.println();
        }}

        public static void main (String[]args){
            pattern(5);
        }
    }

// FULL PYRAMID FOR VALUE N::
package com.internshala.javaapp;

public class Pattern26 {

        static void pattern(int n) {
            for (int row = 1; row <= n; row++) {
                for (int s = n; s >=row; s--) {
                    System.out.print(" ");
                }
                for (int col = 1; col <2*row; col++) {
                    System.out.print("*");
                }
                System.out.println();

            }}

        public static void main (String[]args){
            pattern(7);
        }
    }



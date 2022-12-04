package com.internshala.javaapp;

public class Pattern17 {
    static void pattern(int n) {
        for (int row = 1; row <= n; row++) {

            for (int s = 4; s >= row; s--) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                if (row >= 2 && col > 1) {
                   System.out.print(" ");
                }
                else {
                    System.out.print("*");
                     }
                   }
                     System.out.println();
            }
        }
        public static void main(String[]args){
            pattern(5);
        }
    }
/*OUTPUT::

         *
       *
     *
   *
 *


 */
package com.internshala.javaapp;

public class Pattern21 {
    static void pattern(int n){

     for(int row=5;row>=1;row--){
        for(int s=5;s>row;s--){
            System.out.print(" ");
        }
        for (int col=1;col<2*row;col++) {
            if (col > 1 && col < 2 * row - 1) {
                System.out.print(" ");
            }
            else {
                System.out.print("*");
            }
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        pattern(5);
    }
}

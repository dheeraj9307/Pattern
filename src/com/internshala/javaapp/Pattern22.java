package com.internshala.javaapp;

public class Pattern22 {
    static void pattern(int n){
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                if(row==col || row+col==n-1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(11 );
    }
}

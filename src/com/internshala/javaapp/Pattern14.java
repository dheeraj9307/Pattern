package com.internshala.javaapp;

public class Pattern14 {
    static void pattern(int n){
        for(int row=1;row<=n;row++){
            for(int s=0;s<=row;s++){
                System.out.print(" ");
            }
            for(int col=5;col>=row;col--){
                System.out.print("* ");//you have to add only one spaces in the column(Similar to 9)
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}

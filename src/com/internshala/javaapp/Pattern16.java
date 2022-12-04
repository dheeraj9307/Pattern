package com.internshala.javaapp;

public class Pattern16 {
    static void pattern(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                if(row>=2 && col<=row-1){
                    System.out.print(" ");
                }
                else{
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

package com.internshala.javaapp;

public class Pattern23 {
    static void pattern(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
               if(row>=2&&col>=2 && row<=3 && col<=3){
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
        pattern(4);
    }
}

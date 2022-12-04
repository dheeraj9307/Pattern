package com.internshala.javaapp;

public class Pattern6 {
    static void pattern(int n){
        for(int row=1;row<=n;row++){
            for(int col=5;col>=row;col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
/*

 *****
 ****
 ***
 **
 *



 */
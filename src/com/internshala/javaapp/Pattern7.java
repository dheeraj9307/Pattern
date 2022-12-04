package com.internshala.javaapp;

public class Pattern7 {
    //static void pattern(int n){
    public static void main(String[] args) {


        for (int row = 1; row <= 5; row++) {
            for (int s = 4; s >= row; s--) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
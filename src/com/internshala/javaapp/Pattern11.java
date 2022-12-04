package com.internshala.javaapp;

public class Pattern11 {
    public static void main(String[] args) {

            for (int row = 0; row <5; row++) {
                for (int s = 0; s <= row; s++) {
                    System.out.print(" ");
                }
                for (int col = 9; col >2 * row; col--) {
                    System.out.print("*");
                }
                System.out.println();

            }

        }}




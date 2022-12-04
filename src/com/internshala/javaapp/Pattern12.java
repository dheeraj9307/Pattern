package com.internshala.javaapp;

public class Pattern12 {
    static void pattern(int n){
        for(int row=1;row<=n;row++){
            int TotalcolinRow=row<n?2*n-row:row;
            for(int s=0;s<n-TotalcolinRow;s++){
                System.out.print(" ");
            }
            for(int col=5;col>=1;col--){
                System.out.print(col);
            }
            for (int col=2;col<=5;col++){
                System.out.print(col);
            }
        }

    }

    public static void main(String[] args) {

        pattern(5);

    }
}

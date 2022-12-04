//OUTPUT::Diamond;;
package com.internshala.javaapp;

public class pattern2 {
    static void pattern(int n){
        for(int row=0;row<=2*n;row++){
            int totalColinEachRow=row>n?2*n-row:row;
            int totalSpaces=n-totalColinEachRow;
            for(int s=0;s<totalSpaces;s++){
                System.out.print(" ");
            }
            for(int col=0;col<=totalColinEachRow;col++){
               System.out.print("* ");

                }


            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }

}

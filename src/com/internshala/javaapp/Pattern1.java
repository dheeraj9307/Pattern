//OUTPUT:
/*      *
        **
        ***
        ****
        *****
        ****
        ***
        **
        *
*/
package com.internshala.javaapp;

public class Pattern1 {
    static void pattern(int n){
    for(int row=0;row<=2*n;row++){
        int totalcolinEachRow=row>n?2*n-row:row;
        for(int col=0;col<=totalcolinEachRow;col++){
            System.out.print("*");
        }
        System.out.println();

    }
}

    public static void main(String[] args) {
        pattern(4);
    }}

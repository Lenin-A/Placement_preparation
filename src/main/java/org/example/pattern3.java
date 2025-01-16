package org.example;

import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n=in.nextInt();
        pattern(n);
    }

    static void pattern(int n){
        //for outer loop for the row
        for(int row=0;row<2*n;row++){
            int c= row>n ? 2*n-row: row;
            for(int col=0;col<c;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

package org.example;

import java.util.Scanner;
public class pattern1 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        pattern(n);
    }

    static void pattern(int n){
        // for outer loop in the row
        for(int row=1;row<=n;row++){
            // for inner loop for the column
            for(int col=1;col<=n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println(); // add the new line in the system;
        }
    }
}

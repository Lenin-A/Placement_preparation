package org.example;

import java.util.Scanner;
public class pattern8 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
       System.out.println("Enter the number:");
        int n=in.nextInt();
        pattern(n);
    }

    static void pattern(int n){
       int original=n;
        n=(2*n);
        for(int row=1;row<=n-1;row++){

            for(int col=1;col<=n-1;col++){
              int   atindex=original-Math.min(Math.min(row,col),Math.min(n-row,n-col))+1;
              System.out.print(atindex+ " ");
            }
            System.out.println();
        }

    }
}

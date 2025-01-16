package org.example;

import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        pattern(n);
    }
    static void pattern(int n){
        //for the outer loop
        for(int row=1;row<=n;row++){
            //for the inner loop
            for(int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}

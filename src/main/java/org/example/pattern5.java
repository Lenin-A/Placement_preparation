package org.example;


import java.util.Scanner;
public class pattern5 {
    public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    printTriangle(n);
}

static void printTriangle(int n) {
    for(int row=0;row<n;row++){
        int totalcols=row;
        for(int s=0;s<n-totalcols-1;s++){
            System.out.print(" ");
        }
        for(int col=0;col<2*row+1;col++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}


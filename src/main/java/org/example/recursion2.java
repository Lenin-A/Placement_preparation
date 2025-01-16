package org.example;

import java.util.Scanner;
public class recursion2 {
    public static void main(String[] args){
            System.out.println("Enter the number");
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        System.out.println(fibo(a));
    }
    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}

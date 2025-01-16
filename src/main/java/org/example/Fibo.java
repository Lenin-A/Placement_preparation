package org.example;

import java.util.Scanner;
public class Fibo {
    public static void main(String1[] args){
        System.out.println("Enter the Number:");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        int ans=fibo(n);
        System.out.println(ans);
    }

    static int fibo(int n){
        int a=0;
        int b=1;

        int count=2;
        while(count<=n){
            int temp=b;
            b=a+b;
            a=temp;
            count++;
        }
        return b;
    }
}

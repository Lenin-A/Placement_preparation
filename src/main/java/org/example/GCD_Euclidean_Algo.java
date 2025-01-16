package org.example;

import java.util.Scanner;
public class GCD_Euclidean_Algo {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=in.nextInt();
        System.out.println("Enter the number:");
        int b=in.nextInt();
       System.out.println(gcd(a,b));
    }
    static int gcd(int a,int b){
        if(a==0){
            return b;
        }
    return  gcd(b%a,a);

    }
}

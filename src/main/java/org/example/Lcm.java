package org.example;

import java.util.Scanner;
public class Lcm {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=in.nextInt();
        System.out.println("Enter the number:");
        int b=in.nextInt();
       System.out.println(lcm(a,b));
    }
    static int lcm(int a,int b){
        return a*b/ gcd(a,b);
    }

    static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
}

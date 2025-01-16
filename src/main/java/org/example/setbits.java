package org.example;

import java.util.Scanner;
public class setbits {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=274473;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(set(n));
    }
    static int set(int n){
        int count=0;

        while(n>0){
            count++;
            n=(n& (n-1));
        }
        return count;
    }
}

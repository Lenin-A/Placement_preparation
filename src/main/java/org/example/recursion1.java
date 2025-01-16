package org.example;

import java.util.Scanner;
public class recursion1 {
    public static void main(String[] args){
        print(1);
    }
    static void print(int n){
        if(n==10){
            System.out.print(n);
            return;
        }
        System.out.println(n);
        print(n+1);

    }
}

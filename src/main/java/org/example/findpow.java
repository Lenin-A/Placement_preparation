package org.example;

import java.util.Scanner;
public class findpow {
     public static void main(String[] args){
     System.out.println("Enter the number");
         Scanner in=new Scanner(System.in);
         int n=in.nextInt();
         boolean ans=(n & (n-1)) ==0;
        System.out.println(ans);
     }
}

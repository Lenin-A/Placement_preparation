package org.example;

import java.util.Scanner;
public class TimeComplexityfibo {
     public static void main(String[] arg){
       Scanner in=new Scanner(System.in);
         int n=in.nextInt();
      for(int i=0;i<n;i++){
      System.out.println(fibo(i));
     }
     }
    static int fibo(int n){
          return (int) ((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));

    }



}

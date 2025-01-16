package org.example;

import java.util.Scanner;
public class binary {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int ans=0;
        int n=in.nextInt();
        int b=2;
         System.out.println(digit(n,b));
    }
    static int digit(int n,int b) {
        int ans=0;
        ans=(int) (Math.log(n) / Math.log(b))+1;
        return ans;
    }
}

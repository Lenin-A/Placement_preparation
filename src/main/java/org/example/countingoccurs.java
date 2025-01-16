package org.example;

import java.util.Scanner;
public class countingoccurs {
    public static void main(String1[] args){
        System.out.println("Enter the number:");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        int ans=occur(n);
    System.out.println(ans);
    }

    static int occur(int n){
        int k=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            k=k*10+rem;
        }
        return k;

    }
}

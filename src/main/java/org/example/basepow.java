package org.example;

import java.util.Scanner;
public class basepow {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of base:");
        int n=in.nextInt();
        int p=3;
        System.out.println(pow(p,n));

    }
    static int pow(int p,int n){
        int ans=1;
        while(p>0){
            if((p & 1)==1){
                ans=ans*n;
            }
            n=n*n;
            p=p>>1;
        }

        return ans;
    }
}

package org.example;

import java.util.Scanner;
public class findfactor{
    public static void main(String1[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = in.nextInt();

        System.out.println("Enter the longest of the find factor number:" + findfact(n));
    }
    static String findfact(int n){

        StringBuilder factor= new StringBuilder();
        if(n==0){
            return "no factor";
        }
        if(n>0);
        for(int i=1;i<=n;i++){
            if(n%i==0){
                if(factor.length()>0){
                    factor.append(",");
                }
                factor.append(i);

            }

        }
        return factor.toString();
    }
}

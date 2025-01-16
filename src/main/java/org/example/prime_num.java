package org.example;

import java.util.Scanner;
public class prime_num {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=in.nextInt();
        for(int i=2;i<=n;i++) {
            if (isprime(i)) {
                System.out.println("The prime number is" + " " + i);
            } else {
                System.out.println("The not a prime number is" + " " + i);
            }
        }
    }
    static boolean isprime(int n){
        int c=2;
        while(c*c<=n){

            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;

    }
}

package org.example;

import java.util.Scanner;
public class magicnumber {
    //   pow  0*(5^3)+1*(5^2)+(1)*(5^1) =0+25+5=30 ans=30;
    //magic number means for eg :n=3,  in binary 0 1 1
    public static void main(String[] args){
        Scanner  in =new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=in.nextInt();
        System.out.println(ans(n));
    }
    static int ans(int n){
        int ans=0;
        int base=5;
        while(n>0){
            int last=n&1;
            n=n>>1;//right means 011-> becomes 001 LSB REMOVED
        ans=ans+(last*base);
            base=base*5;
        }
        return ans;
    }
}

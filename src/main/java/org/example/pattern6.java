package org.example;

import java.util.Scanner;
public class pattern6 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        pattern(n);

    }
    static void pattern(int n){
        for(int row=1;row<=n;row++){
            //space
            for(int s=0;s<n-row;s++){
                System.out.print("  ");
            }

            for(int col=row;col>=1;col--){
                System.out.print(col+" ");
            }
            for(int col=2;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }

    }
}

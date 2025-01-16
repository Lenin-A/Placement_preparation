package org.example;

import java.util.Scanner;
public class pattern7 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=in.nextInt();
       pattern(n);
    }
    static void pattern(int n){
        for(int row=1;row<=2*n;row++){
            //spaces
            int c=row>n ? 2*n-row:row;
          for(int s=0;s<n-c;s++){
              System.out.print("  ");
          }


            for(int col=c;col>=1;col--){
                System.out.print(col+" ");
            }
            for(int col=2;col<=c;col++){
                System.out.print(col+" ");
            }
            System.out.println();

        }
//        System.out.println();
    }
}

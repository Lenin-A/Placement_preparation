package org.example;

import java.util.Scanner;
public class pattern4 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        pattern(n);
    }
    static void pattern(int n){

        //outer loop for forloop
        for(int row=0;row<2*n;row++){

            int totalcolumns=  row>n ? 2*n-row:row;
            // no of the spaces
            for(int s=0;s<n-totalcolumns;s++){
               System.out.print(" ");
            }
            //inner loops for the innerloop
            for(int col=0;col<totalcolumns;col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

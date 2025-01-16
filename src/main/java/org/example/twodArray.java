package org.example;


import  java.util.Arrays;
import java.util.Scanner;
public class twodArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[][] arr=new int[n][n];

        //input;
        for(int i=0;i<n;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=in.nextInt();
            }
            System.out.println();
        }
        // output
        for(int i=0;i<n;i++){
            System.out.println(Arrays.toString((arr[i])));
        }
    }
}

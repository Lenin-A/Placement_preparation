package org.example;

import java.util.Scanner;
public class seivo_erathosthenes {
    public static void main(String[] args) {


    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number");
    int n =in.nextInt();
   boolean[] arr=new boolean[n+1];
    seivo(n,arr);
    }

    static void seivo(int n,boolean[] arr){

        for(int i=2;i*  i<=n;i++){
            if(!arr[i]){
                 for(int j=i*2;j<=n;j=i+j){
                     arr[j]=true;
                 }
            }
        }
        for(int i=0;i<=n;i++){
            if(!arr[i]){
                System.out.print(i+" ");
            }
        }
        

    }

}

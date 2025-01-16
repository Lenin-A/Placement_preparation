package org.example;

// for the identify the square root of the number:
import java.util.Scanner;
public class Newton_Raphason {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=in.nextInt();
        System.out.printf("%.2f",raph(n));

    }
    static double raph(int n){
        double x=n;
        double root;
        while(true){
            root=(x+(n/x))*0.5;

            if(Math.abs(root-x)<0.1){
                break;
            }
            x=root;
        }
        return root;
    }
}

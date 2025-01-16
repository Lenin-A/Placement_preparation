package org.example;

import java.util.ArrayList;
import java.util.Scanner;
public class Factors {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=in.nextInt();
        factor1(n);

      }
    // brute force approach ->time complexity O(n); and space is constant ->O(1)
    static void factor(int n){
        for(int i=1;i<=n;i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
    // optimized the for O(sqrt(n));
    static void factor1(int n){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " ");
                    list.add(n/ i);
                }
            }
        }
            for(int i=list.size()-1;i>=0;i--){
                System.out.print(list.get(i) + " ");
            }
        }

    }


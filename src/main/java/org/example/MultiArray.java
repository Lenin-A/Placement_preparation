package org.example;

import java.util.ArrayList;
import java.util.Scanner;
public class MultiArray {
    public static void main(String1[] args){
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
            Scanner in=new Scanner(System.in);

            // initialisation
         for(int i=0;i<3;i++){
             list.add(new ArrayList<>());
         }
         //input
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(in.nextInt());
            }
        }
        //output;
        System.out.println(list);
    }
}

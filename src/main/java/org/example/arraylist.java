package org.example;


import java.util.ArrayList;
import java.util.Scanner;
public class arraylist {
    public static void main(String1[] args) {
        ArrayList<Integer>list=new ArrayList<>(10);
//          list.add(44);
//          list.add(56);
//          list.add(67);
//          list.add(97);
//          list.add(100);
//
//          System.out.println(list.contains(453));
//            list.set(1,453);
//          System.out.println(list);
//          list.remove(0);
//          System.out.println(list);

        // input
        Scanner in=new Scanner(System.in);
        for(int i=0;i<5;i++){
            list.add(in.nextInt());
        }
        //output
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));
        }
    }

}
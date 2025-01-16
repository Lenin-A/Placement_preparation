package org.example;

import java.util.Scanner;
public class Numberoccursonce {
    public static void main(String[] args){
        int[] arr={2,2,2,5,7,8,8,7,7,8};
        System.out.println(occur(arr));

    }

    static int occur(int[] arr){
        int result=0;

        for(int i=0;i<32;i++){

            int bit=0;
            for(int num:arr) {
                bit = bit + ((num >> i) & 1);
            }

            if(bit%3!=0){
                result=result | (1<<i);
            }
        }


        return result;
    }
}

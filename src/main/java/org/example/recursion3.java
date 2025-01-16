package org.example;

import java.util.Scanner;
public class recursion3 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number:");
        int target=in.nextInt();
        int[] arr={10,20,35,40,55,59};
    System.out.println(binary(arr,target,0,arr.length-1));
    }
    static int binary(int[] arr,int target,int start,int end){
       if(start>end) {
           return -1;
       }
        int mid=start+(end-start)/2;

        if(target==arr[mid]){
            return mid;
        }
        if(target>arr[mid]) {
            return binary(arr, target, mid + 1, end);
        }
            return binary(arr,target,start,mid-1);
    }
}

package org.example;
import java.util.Arrays;

public class cyclicsort {
    public static void main(String1[] args){
        int[] arr={4,5,1,3,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            i++;

        }
    }
    static void swap(int[] arr,int i,int correct){
        int temp=arr[i];
         arr[i]=arr[correct];
         arr[correct]=temp;
    }
}

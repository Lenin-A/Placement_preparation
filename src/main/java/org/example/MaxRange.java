package org.example;

public class MaxRange {
    public static void main(String1[] args){
        int[] arr={1,3,7,23,6,18};

        System.out.println(max(arr,1,3));
    }
    static int max(int[] arr,int start,int end){
          int max=Integer.MIN_VALUE;
          for(int i=start;i<=end;i++){
              if(arr[i]>max){
                  max=arr[i];
              }
          }
   return max;
    }
}

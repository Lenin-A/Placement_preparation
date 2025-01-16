package org.example;


public class RotatedBinary {
     public static void main(String1[] args){
         int[] nums={4,5,6,7,0,1,2,3};
         int target=0;
         System.out.println(search(nums,target));
     }

     static int search(int[] arr,int target){
             int pivot=findpivot(arr);

             if(pivot==-1){
                 return Binary(arr,target,0,arr.length-1);
             }
             // case
             if(arr[pivot]==target){
                 return pivot;
             }
             if(target >=arr[0]){
                 return Binary(arr,target,0,pivot-1);
             }
             else{
                 return Binary(arr,target,pivot+1,arr.length-1);
             }

         }

         static int findpivot(int[] arr){
             int start=0;
             int end=arr.length-1;
             while(start<=end){
                 int mid=start+(end-start)/2;

                 // case1:
                 if(mid<end && arr[mid]>arr[mid+1]){
                     return mid;
                 }
                 else if(mid<end && arr[mid]<arr[mid+1]){
                     return mid+1;
                 }
                 else if(arr[start]<=arr[mid]){
                     end=mid-1;
                 }
                 else{
                     start=mid+1;
                 }
             }
             return -1;
         }

         static int Binary(int[] arr,int target,int start,int end){
             while(start<=end){
                 int mid=start+(end-start)/2;

                 if(target==arr[mid]){
                     return mid;
                 }
                else if(arr[mid]>target){
                     end=mid-1;
                 }
                 else{
                     start=mid+1;
                 }

             }
             return -1;
         }
    }

package org.example;

public class ceiling {
    public static void main(String1[] arg){
        int[] arr={2,4,5,6,8,10};
     int target=7;
     int ans=ceil(arr,target);
     System.out.println(ans);

    }
    static int ceil(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        int start=0;
        int end=arr.length-1;

        // array is sorted then do the binary search
        while(start<end){
            int mid=start+(end-start/2);

            if(target==arr[mid]){
                return mid;
            }
            if(target>arr[mid]){
                start=mid+1;
            }
            if(target<arr[mid]){
                end=mid-1;
            }
        }
        return start;
    }
}

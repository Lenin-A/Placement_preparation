package org.example;


public class infiniteArray{
    public static void main(String1[] main){
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
        int target=9;
    System.out.println(find(arr,target));

    }
    static int find(int[] arr,int target){
        int start=0;
        int end=1;

        while(target>end){
            int temp=end;
            end=end+(end-start+1)/2;
            start=temp;
        }
       return search(arr,target,start,end);
    }

    static int search(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}



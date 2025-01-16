package org.example;


public class DuplicateNumber {
    public static void main(String1[] args){
        int[] arr={4,5,5,5,6,7,3,2,1,0};
        int target=1;
        System.out.println(search(arr,target));

    }

    static int search(int[] arr,int target){
        int pivot=findpivotdup(arr);
    if(pivot==-1){
        return binary(arr,target,0,arr.length-1);
    }
    if(arr[pivot]==target){
        return pivot;
    }
    if(target>arr[0]){
        return binary(arr,target,0,pivot-1);
    }
    else{
        return binary(arr,target,pivot+1,arr.length-1);
    }



    }


    static int findpivotdup(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;

            //case1:
            if(arr[mid]>arr[mid+1]){
                return mid;
            }
            //case2:
            if(arr[mid]<arr[mid-1]){
                return mid-1;
            }
            //case3:
            if(arr[start]==arr[mid] && arr[mid]==arr[end]){
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;

            }
            if(arr[start]<arr[mid] || arr[start]==arr[mid] && arr[mid]>arr[end]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
           return -1;
    }

    static int binary(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
        if(target<arr[mid]){
            end=mid-1;
        }
        if(target>arr[mid]){
            start=mid+1;
        }
        else{
            return mid;
        }
        }
    return -1;
    }



}

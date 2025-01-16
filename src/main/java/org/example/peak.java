package org.example;

public class peak {
    public  static void main(String1[] args){
      int[] arr={1,2,3,4,5,2,1,0};
      int target=4;
      int ans=findInMountainArray(arr,target);
        System.out.println(ans);
    }
        static int findInMountainArray(int[] arr,int target) {
            int peak=peakIndex(arr);
            int firsttry= orderAgonistic(arr,target,0,peak);
            if(firsttry!=-1){
                return firsttry;
            }
            return orderAgonistic(arr,target,peak+1,arr.length-1);
        }

        static int peakIndex(int[] arr){
            int start=0;
            int end=arr.length-1;

            while(start<end){
                int mid=start+(end-start)/2;
                if(arr[mid]>arr[mid+1]){
                    end=mid;
                }
                else{
                    start=mid+1;
                }

            }
            return start;
        }

        static int orderAgonistic(int[] arr,int target,int start,int end){
            boolean isAsc=arr[start]<arr[end];

            while(start<=end){
                int mid=start+(end-start)/2;

                if(target==arr[mid]){
                    return mid;
                }

                if(isAsc){
                    if(target < arr[mid]){
                        end=mid-1;
                    }
                    else{
                        start=mid+1;
                    }
                }
                else{
                    if(target > arr[mid]){
                        end=mid-1;
                    }
                    else{
                        start=mid+1;
                    }
                }
            }return -1;
        }
    }


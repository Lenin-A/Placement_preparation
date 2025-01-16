package org.example;


public class linear {
    public static void main(String1[] args){
        int[] arr={2,1,233,556,32,99,77,222,44};
        int target=32;
        System.out.println(lin(arr,target));
    }

    static int lin(int[] arr,int target){

        if(arr.length==0){
            return -1;
        }

        for(int i=0;i<arr.length;i++){
            int element=arr[i];

            if(target==element){
                return i;
            }
        }
        return -1;
    }
}

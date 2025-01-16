package org.example;

import java.util.Scanner;
public class containerWater {
    public static void main(String1[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no the size:");
        int n=in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the number");
          arr[i]= in.nextInt();
        }
        System.out.println("The Maximum area of the height:"+water(arr));
    }

    static int water(int[] arr){
        int left=0;
        int right=arr.length-1;
        int maxm=0;
        while(left<right){
            int width=right-left;
            int height=Math.min(arr[left],arr[right]);

            int area=width*height;

            if(area>maxm){
                maxm=area;
            }

            if(arr[left]<arr[right]){
                left++;
            }else{
                right--;
            }
        }return maxm;
    }
}
//For the input height = [1, 8, 6, 2, 5, 4, 8, 3, 7]:
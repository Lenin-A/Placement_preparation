package org.example;

public class countdigit {
     public static void main(String[] args) {
         int[] nums = {12, 345, 0, 3, 2345};
           int ans=findNumbers(nums);
           System.out.println(ans);
     }

    static int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(even(nums[i])){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num1){
        int digitnum=count1(num1);

        if(digitnum%2==0){
            return true;
        }
        return false;
    }

    static int count1(int num3){
        if(num3<0){
            num3=num3*-1;
        }
        if(num3==0){
            return 1;
        }

        int c=0;
        while(num3>0){
            c++;
            num3=num3/10;
        }
        return c;
    }
}


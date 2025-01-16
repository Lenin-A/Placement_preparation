package org.example;


public class evendigt {
    public static void main(String1[] args){
        int[] arr={12,345,2,6,7896};
        int ans=even(arr);
        System.out.println(ans);
    }

    static int even(int[] arr){
     int count=0;
        for(int i=0;i<arr.length;i++) {
            if (even(arr[i])) {
                count++;
            }
        }
        return count;
    }
static boolean even(int z){
     int num=count(z);
     if(num%2==0){
         return true;
     }
        return false;
}

    static int count(int a){
       int digit=0;
        while(a>0){
            digit++;
        a=a/10;
        }
        return digit;
    }
}

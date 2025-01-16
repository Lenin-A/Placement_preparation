package org.example;

public class findnonrepeatnum {
     public static void main(String[] args){
         int[] arr={2,3,3,1,2,6,1};
         System.out.println(ans(arr));
     }

     static int ans(int[] arr){
         int uni=0;

         for(int c:arr){
             uni=uni^c;
         }
         return uni;

     }

}

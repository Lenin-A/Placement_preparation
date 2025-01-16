package org.example;


public class StringCharArray {
    public static void main(String1[] args){
        String arr="kunal";
        char target='n';
        System.out.println(str(arr,target));
    }
    static int str1(String arr, char target){

        if(arr.length()==0){
            return -1;
        }

        for(int i=0;i<arr.length();i++){
            if(target==arr.charAt(i)){
                return i;
            }
        }
         return -1;
    }


static boolean str(String arr, char target){
    if(arr.length()==0){
        return false;
    }

    for(char ch:arr.toCharArray()){
        if(ch==target){
            return true;
        }
    }
  return false;
}
}
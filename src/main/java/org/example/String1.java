package org.example;

public class String1 {
    public static  void main(String1[] args){
        //Scanner in=new Scanner(System.in);
        String str= "Kunal";
        char target='u';
        System.out.println(search(str,target));

    }

    static boolean search(String str,char target){

        for(char ch:str.toCharArray()) {
            if (ch == target) {
                return true;
            } else {
                return false;
            }
        }
      return false;
    }
}

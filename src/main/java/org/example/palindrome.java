package org.example;

import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String n=in.nextLine();

        String inp=n.toLowerCase().replaceAll("[^a-zA-Z0-9]","");

        if(ispalindrome(inp)){
            System.out.println("Its the string is palindrome");
        }
        else{
            System.out.println("its not an Palindrome");
        }
    }
    static boolean ispalindrome(String inp){
        int start=0;
        int end=inp.length()-1;

        while(start<end){
            if(inp.charAt(start)!=inp.charAt(end)){
                return false;
            }start++;
            end--;

        }return true;
    }
}

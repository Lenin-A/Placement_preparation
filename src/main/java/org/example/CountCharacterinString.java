package org.example;


/*
input-wwbbcdd
output-2w2b1c2d
filtered output-22b1c1d  || remove w because of challenge token can be removed

 */
import java.util.Scanner;
public class CountCharacterinString {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string");
        System.out.println(Find(in.nextLine()));

    }

    static String  Find(String s){
        StringBuilder str=new StringBuilder();
        int count=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)==(s.charAt(i))){
                count++;
            }
            else {
                str.append(count).append(s.charAt(i-1));
                count=1;
            }
        }
        str.append(count).append(s.charAt(s.length()-1));

        StringBuilder form=new StringBuilder();

        String token="vkwprij9u480";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
        if(token.toLowerCase().indexOf(Character.toLowerCase(ch))==-1){
            form.append(ch);
        }
        }
        return form.length()>0 ? form.toString() : "Empty";
    }

}

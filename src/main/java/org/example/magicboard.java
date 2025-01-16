//Enter the digits:65666768
//Sample Output 1:
//65-A
//66-B
//67-C

package org.example;
import java.util.Scanner;
public class magicboard {
    public static void main(String1[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no of the digits:");
        int digit = in.nextInt();

        if(String.valueOf(digit).length()!=8){
               System.out.println("Please enter the exactly correct number");
        }else{
            magic(digit);
        }
    }


    static void magic(int digit){
        for(int i=3;i>=0;i--){
            int pair = digit/(int)Math.pow(100,i);
            char character = (char)pair;
            System.out.println(pair+"-"+character);
            digit=digit%(int)Math.pow(100,i);
        }
    }
}

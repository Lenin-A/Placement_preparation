package org.example;
import java.util.Scanner;
public class placement {
    public static void main(String1[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no of the mech:");
        int mech = in.nextInt();
        System.out.println("Enter the no of the cse:");
        int cse = in.nextInt();
        System.out.println("Enter the no of the ece");
        int ece = in.nextInt();

        if(mech <0 || ece<0 || cse < 0){
            System.out.println("Enter the invalid the input:");
        }
        if(mech==ece & ece==cse){
            System.out.println("none of the department of the highest of the placement");
        }else{
            int max=mech;
            String highpl="MECH";
            if(max<ece){
                max=ece;
                highpl="ECE";
            }
            else{
                max=cse;
                highpl="CSE";
            }
            System.out.println("Highest placement:"+ highpl);
        }

    }
}

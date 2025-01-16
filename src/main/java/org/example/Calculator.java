package org.example;

import java.util.Scanner;
public class Calculator {
    public static void main(String1[] args){
        Scanner in=new Scanner(System.in);
int ans=0;
        while(true){
            System.out.println("enter the operator:");
            char op=in.next().trim().charAt(0);
            if(op=='+' || op=='-' || op=='*' || op=='/'  || op=='%'){
                System.out.println("Enter the number1:");
                int num1=in.nextInt();
                System.out.println("Enter the number2:");
                int num2=in.nextInt();

                if(op=='+'){
                    ans=num1+num2;
                }
                if(op=='-'){
                    ans=num1-num2;
                }
                if(op=='*'){
                    ans=num1*num2;
                }
                if(op=='/'){
                    if(num2!=0){
                        ans=num1/num2;
                    }
                }
                if(op=='%'){
                    ans=num1%num2;
                }
            }
            else{
                if(op=='x' || op=='X'){
                    System.out.println("Calculator is off");
                    break;
                }
                else{
                    System.out.println("Operator is invalid");
                }
            }System.out.println("The answer is "+ ans);

        }
    }
}

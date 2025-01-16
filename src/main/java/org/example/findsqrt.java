package org.example;



import java.util.Scanner;
public class findsqrt {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=in.nextInt();
        System.out.println("Enter the precision of the number:");
        int p=in.nextInt();
      System.out.printf("%.3f%n" , sqrt(n, p));

        //System.out.printf("%.3f%n",sqrt(n, p));


    }

    static double sqrt(int n,int p){
        double root=0.0;
        int start=0;
        int end=n;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid*mid==n){
                return mid;
            }
            if(mid*mid>n){
                end=mid-1;
            }
            else{
                start=mid+1;
                root=mid;
            }
        }
        double incr=0.01;
        for(int i=0;i<p;i++){
            while(root*root<=n){
                root=root+incr;
            }
            root=root-incr;
            incr=incr/10;
        }


        return root;
    }
}

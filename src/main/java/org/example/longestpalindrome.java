package org.example;
import java.util.Scanner;
public class longestpalindrome {
    public static void main(String1[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println("Length of the longest palindrome substring:"+ ispalindrome(s));
    }
    static int ispalindrome(String s){
        int n=s.length()-1;
        int[][] dp = new int[n][n];

        for(int i=0;i<n;i++){
            dp[i][i]=1;
        }

        for(int length=2;length<=n;length++){
            for(int i=0;i<=n-length;i++) {
                int j=i+length-1;

                if(s.charAt(i)==s.charAt(j)){
                    dp[i][j]=dp[i+1][j-1]+2;
                }else{
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);
                }

            }
        }
        return dp[0][n-1];

    }
}

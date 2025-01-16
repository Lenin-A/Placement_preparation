package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String1[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        // input:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter the number:");
                arr[i][j] = in.nextInt();
            }
        }
        // user:
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(Arrays.toString(arr[i]));

            }
            System.out.println();
        }
    }
}
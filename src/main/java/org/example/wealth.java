package org.example;


import java.util.Arrays;
public class wealth {
    public static void main(String1[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] ans = wea(arr);
        System.out.println(Arrays.toString(ans));
    }


    static int[] wea(int[][] arr) {
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
            if (sum > maxsum) {
                maxsum = sum;
            }
        }
        return new int[]{maxsum};

    }
}

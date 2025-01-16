package org.example;

import java.util.Arrays;
public class Matrixcolrow {
    public static void main(String[] args){
        int[][] arr={
                {10,20,30,40},
                {15,25,35,45},
                {16,26,36,46},
                {17,27,37,47}
        };
        int target=36;
        System.out.println(Arrays.toString((Search(arr,target))));
    }

    static int[] Search(int[][] matrix,int target){
        int row=0;
        int col=matrix.length-1;

        while(row<matrix.length-1 && col>0){
            if(matrix[row][col]==target){
                return new int[]{row,col};
            }
            if(matrix[row][col]<target){
                row++;
            }else{
                col--;
            }
        }
        return new int[] {-1,-1};
    }
}

package org.example;

import java.util.Arrays;
public class Binary2d {
    public static void main(String[] args){
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}
        };
        int target=8;
        System.out.println(Arrays.toString(search(arr,target)));
    }

    static int[] search(int[][] matrix,int target){
        int row=matrix.length;
        int cols=matrix[0].length;

        if(cols==0){
            return new int[]{-1,-1};
        }
        if(row==1){
            return binary(matrix,target,0,0,cols-1);
        }
        // remaining 2rows until loop can be run
        int rstart=0;
        int rend=row-1;
        int cmid=cols/2;

        while(rstart<(rend-1)){
            int rmid=rstart+(rend-rstart)/2;
         if(matrix[rmid][cmid]==target){
             return new int[]{rmid,cmid};
         }
         if(matrix[rmid][cmid]<target){
             rstart=rmid;
         }else{
             rend=rmid;
         }
        }
        // we got remaining 2rows
        if(target==matrix[rstart][cmid]){
            return new int[]{rstart,cmid};
        }
        if(target==matrix[rstart+1][cmid]){
            return new int[] {rstart+1,cmid};
        }
        if(matrix[rstart][cmid-1] >=target){
                return binary(matrix,target,rstart,0,cmid-1);
        }
        if(matrix[rstart][cmid+1]<=target && target<=matrix[rstart][cols-1]){
            return binary(matrix,target,rstart,cmid+1,cols-1);
        }
        if(matrix[rstart][cmid-1] >=target){
            return binary(matrix,target,rstart+1,0,cmid-1);
        }
        else{//(matrix[rstart][cmid+1]<=target && target<=matrix[rstart][cols-1]){
            return binary(matrix,target,rstart+1,cmid+1,cols-1);
        }
    }

    static int[] binary(int[][] matrix,int target,int row,int Cstart,int Cend){
        while(Cstart<=Cend){
            int mid=Cstart+(Cend-Cstart)/2;

            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid]<target){
                Cstart=mid+1;
            }
            else{
                Cend=mid-1;
            }
        }
        return new int[] {-1,-1};

    }
}

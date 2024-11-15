package com.vishal.DataStruture.Array;

import java.util.Arrays;

public class SpiralMatrix {
    public static void main(String[] args) {
        int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
        printSpiral(arr);
    }

    private static void printSpiral(int[][] arr) {
        int rows=0;
        int rowe= arr.length-1;
        int cols=0;
        int cole= arr[0].length-1;
        //left to right
        for(int i=cols ;i<=cole;i++){
            System.out.print(arr[rows][i]);
        }
        rows ++;
        System.out.print(" ");
        // top to bottom
        for(int i=rows;i<=rowe;i++){
            System.out.print(arr[i][cole]);
        }
        cole --;
        // right to left
        System.out.print(" ");
        if(rows <= rowe){
            for(int i=cole ;i>=cols;i--){
                System.out.print(arr[rowe][i]);
            }
            rowe --;
        }
        System.out.print(" ");
        if(cols <=cole){
            // to up
            for(int i=rowe;i>=rows;i--){
                System.out.print(arr[i][cols]);
            }
            cols++;
        }
    }

}


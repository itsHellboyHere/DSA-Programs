package com.vishal.DataStruture.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class rotateImage {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        rotateImage90(arr);

        for(int[] r:arr){
            reverseArray(r);
            for (int n:r){
                System.out.print(n);
            }

            System.out.println();
        }
    }
    private static void reverseArray(int[] arr){
        int i=0;
        int j= arr.length-1;
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
    }
    static List<Integer> ans=new ArrayList<>();
    private static void rotateImage90(int[][] arr) {
        int row_start = 0;
        int row_end = arr.length - 1;
        int col_end = arr[0].length - 1;
        int col_start = 0;

        for (int i = 0; i <= row_end; i++) {
            for(int j=col_end;j>=i+1;j--) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;

            }
        }


    }
}

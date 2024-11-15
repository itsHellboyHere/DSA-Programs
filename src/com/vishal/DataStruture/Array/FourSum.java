package com.vishal.DataStruture.Array;

import com.vishal.oopsExamples.Scope.A;

import java.awt.image.WritableRaster;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int[]arr={2,2,2,2,2};
        List<List<Integer>> ans=findFourSum(arr,0);
        System.out.println("Values are => "+ans);
    }

    private static List<List<Integer>> findFourSum(int[] arr, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-3;i++){
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            for(int j=i+1;j< arr.length-2;j++){
                if (j > i + 1 && arr[j] == arr[j - 1]) {
                    continue;
                }
                int left=j+1;
                int right=arr.length-1;
                while (left<right){
                    int sum=arr[i]+arr[j]+arr[left]+arr[right];
                    if(sum==target){
                        ans.add(Arrays.asList(arr[i], arr[j], arr[left], arr[right]));
                        while (left < right && arr[left] == arr[left + 1]) left++;
                        while (left < right && arr[right] == arr[right - 1]) right--;
                        left++;
                        right--;
                    } else if (sum >target) {
                        right --;
                    }else{
                        left++;
                    }
                }
            }
        }

        return ans;
    }
}

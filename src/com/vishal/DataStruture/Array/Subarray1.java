package com.vishal.DataStruture.Array;

import java.util.ArrayList;

//Find Subarray with given Sum from Array of non-negative Numbers
//Input: arr[] = { 15, 2, 4, 8, 9, 5, 10, 23}, sum = 23
//        Output: 2 5
//        Explanation: Sum of elements between indices 2 and 5 is 2 + 4 + 8 + 9 = 23
public class Subarray1 {
    public static void main(String[] args) {
            int[] arr={1, 4, 0, 0, 3, 10, 5};
            int sum=7;
            ArrayList<Integer> ans = findsum(arr,sum);
        System.out.println(ans);
    }
    public static ArrayList<Integer> findsum(int[]arr,int sum){
        int start =0;
        int last =0;
        int c_sum=0;
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        Boolean flag=false;

        for(int i=0;i<n;i++){
            c_sum+=arr[i];
            if(c_sum >=sum){
                last=i;
                while(sum <c_sum && start < last){
                    c_sum -=arr[start];
                    ++start;
                }
                if(c_sum == sum){
                    res.add(start+1);
                    res.add(last+1);
                    flag=true;
                    break;
                }
            }
        }
        if(!flag){
            res.add(-1);
        }
        return res;
    }
}

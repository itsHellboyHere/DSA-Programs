package com.vishal.DataStruture.Practice;

import java.util.PriorityQueue;

public class KTHLARGEST {
    public static void main(String[] args) {
        int[] nums={3,2,1,5,6,4};
        int k=2;
        int ans=findKthelement(nums,k);
        System.out.println("Kth element is "+ ans);
    }
    private static int findKthelement(int[] nums,int k){
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b-a);
        for(int num:nums){
            queue.add(num);
        }
        for(int i=0;i<k-1;i++){
            queue.poll();
        }
        return queue.peek();
    }
}

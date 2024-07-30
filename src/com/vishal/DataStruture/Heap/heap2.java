package com.vishal.DataStruture.Heap;
//find the kth maximum element in the array
import java.util.Collections;
import java.util.PriorityQueue;

public class heap2 {
    public static void main(String[] args) {
        int  arr[]={3,2,3,1,2,4,5,5,6};
//        Integer[] a= new ArrayList<Integer>(Arrays.asList(arr));
        int k=4;
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
//        maxheap.offer(6);
//        maxheap.offer(3);
//        maxheap.offer(10);
        for(int num : arr){
            maxheap.add(num);
        }
//            maxheap.addAll(Arrays.asList(arr));

//        for(int i=0;i<maxheap.size()-1;i++){
//            System.out.println("max "+maxheap.poll());
//        }
        for(int i=0;i<k-1;i++){
            maxheap.poll();
        }
        System.out.println(maxheap.peek());

    }
}

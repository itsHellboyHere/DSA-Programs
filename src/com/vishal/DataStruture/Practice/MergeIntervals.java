package com.vishal.DataStruture.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int [][] nums={{1,3},{2,6},{8,10},{15,18}};
        int ans[][]=mergeintervals(nums);
        for(int i=0;i<ans.length;i++){
            System.out.println(Arrays.toString(ans[i]));
        }
    }
    private static int[][] mergeintervals(int[][] intervals){
      if(intervals.length <=1){
          return intervals;
      }
      Arrays.sort(intervals, (a,b)-> Integer.compare(a[0],b[0]));
      int[] currentInterval=intervals[0];
      List<int[]> merge= new ArrayList<>();
      merge.add(currentInterval);
      for(int interval[] :intervals){
          int currentEnd=currentInterval[1];
          int nextstart=interval[0];
          int nextEnd=interval[1];
          if(currentEnd >= nextstart){
              currentInterval[1]=Math.max(currentEnd,nextEnd);
          }else{
              currentInterval=interval;
              merge.add(currentInterval);
          }
        }
      return merge.toArray(new int [merge.size()][]);
    }
}

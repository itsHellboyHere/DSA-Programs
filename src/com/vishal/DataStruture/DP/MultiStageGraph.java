package com.vishal.DataStruture.DP;

import com.vishal.DataStruture.Recursion.MaxValue;

import java.util.Arrays;

public class MultiStageGraph {
    public static void main(String[] args) {

        int [][] graph={
                {0,1,2,5,0,0,0,0},
                {0,0,0,0,4,11,0,0},
                {0,0,0,0,9,5,16,0},
                {0,0,0,0,0,0,2,0},
                {0,0,0,0,0,0,0,18},
                {0,0,0,0,0,0,0,13},
                {0,0,0,0,0,0,0,2},
                {0,0,0,0,0,0,0,0},

        };
        MultiStageGraph obj=new MultiStageGraph();
        int ans= obj.findShortestPath(graph);
        System.out.println(ans);
//        System.out.println(graph[][]);

    }

    public int findShortestPath(int [][] graph){
      int min;
      int n=7;
      int cost[] =new int[n+1];
      int dis[] =new int[n+1];
      int stage=4;
      cost[n]=0;
      for(int i=n-1; i>=0;i--){
          min=Integer.MAX_VALUE;
          for(int k=i+1;k<=n;k++){
              if(graph[i][k]!=0 && graph[i][k] + cost[k] <min){
                  min=graph[i][k] +cost[k];
                  dis[i]=k;
              }
          }
          cost[i]=min;
      }
      return cost[0];
    }
}



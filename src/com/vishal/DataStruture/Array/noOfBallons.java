package com.vishal.DataStruture.Array;

import java.util.*;

public class noOfBallons {
    public static void main(String[] args) {
        String s="lloo";
        findMaxBallonsInstance(s);
    }

    private static void findMaxBallonsInstance(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        String b="balon";
        Set<Character> set=new HashSet<>();
        for(int i=0;i<b.length();i++){
            set.add(b.charAt(i));
        }

        for(int i=0;i<s.length();i++){
           if(set.contains(s.charAt(i))){
               map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
           }
        }
        System.out.println(map);
//        List<Integer> ans=new ArrayList<>();
        int ans=Integer.MAX_VALUE;
        for(Character k:b.toCharArray()){
            int count=map.getOrDefault(k,0);
            if(k=='l' || k=='o'){
                ans=Math.min(ans,count/2);
            }else{
                ans=Math.min(ans,count/1);
            }
        }
        System.out.println("Ans => "+ans);

    }

}

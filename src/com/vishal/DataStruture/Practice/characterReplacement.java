package com.vishal.DataStruture.Practice;

import java.util.HashMap;

public class characterReplacement {
    public static void main(String[] args) {
        String s="AABABBA";
        int k=1;
        int ans=replaceChar(s,k);
        System.out.println("Max-length => "+ans);
    }

    private static int replaceChar(String s, int k) {
        int maxCount=0;
        int maxLength=0;
        int left=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
           char charcter=s.charAt(i);
           map.put(charcter, map.getOrDefault(charcter,0)+1);
           maxCount=Math.max(maxCount,map.get(charcter));
           int windowSize=i-left+1;
           // check for window is valid or not
            // if it exceeds the total replacement count of k
            // it becomes invalid.
            //slide the window
           if(windowSize -maxCount >k){
               char leftChar= s.charAt(left);
               map.put(leftChar,map.get(leftChar)-1);
               left++;
           }
           maxLength=Math.max(maxLength,i-left+1);
        }
        return maxLength;
    }
}

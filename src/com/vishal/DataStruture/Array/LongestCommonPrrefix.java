package com.vishal.DataStruture.Array;

public class LongestCommonPrrefix {
    public static void main(String[] args) {
        String[] array= {"flower","flow","flight","float"};
        String ans=LCP(array,0, array.length-1);
        System.out.println(ans);
    }
    public static String LCP(String[] s,int l,int r){
        if(l==r){
            return s[l];
        }
        int mid=(l+r)/2;
        String left=LCP(s,l,mid);

        String right=LCP(s,mid+1,r);
        return compareString(left,right);
    }
    private  static String compareString(String l,String r){
        int min_length=Math.min(l.length(),r.length());
        for(int i=0;i<min_length;i++){
            if(l.charAt(i) !=r.charAt(i)){
                return l.substring(0,i);
            }
        }
        return l.substring(0,min_length);
    }
}

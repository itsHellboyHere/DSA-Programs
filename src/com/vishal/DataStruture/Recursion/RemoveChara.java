package com.vishal.DataStruture.Recursion;

public class RemoveChara {
    public static void main(String[] args) {
        String str="aaaauyaa";
        removeChara(str,0,"",'a');
    }
    public static void removeChara(String str, int idx ,String newString,char ch){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        if(str.charAt(idx)=='a'){
            removeChara(str,idx+1,newString,ch);
        }
        else {
            removeChara(str,idx+1,newString+str.charAt(idx),ch);
        }
    }
}

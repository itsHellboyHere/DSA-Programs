package com.vishal.pattern;
//1
//23
//456
//78910
public class patter3 {
    public static void main(String[] args) {
        print(5 ,1);
    }
    public  static  void print(int n , int count){
        for(int r =1; r <=n ;r++){
            for(int col =1 ;col <=r ;col++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

}

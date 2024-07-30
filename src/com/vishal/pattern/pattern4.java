package com.vishal.pattern;
//5 4 3 2 1
//4 3 2 1
//3 2 1
//2 1
//1
public class pattern4 {
    public static void main(String[] args) {
        print(5);
    }
    public  static  void print (int n){
        for(int r=n ;r>=1;r--){
            for(int col =r ;col >=1;col --){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}

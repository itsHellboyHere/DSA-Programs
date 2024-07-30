package com.vishal.pattern;
//____1
//___21
//__321
//_4321
//54321


public class patern2 {
    public static void main(String[] args) {
        print();
    }
    public  static  void print(){
        int n=5;
        for(int r=1 ;r<=n ;r++){
            for (int s=n; s>r; s--){
                System.out.print(" ");
            }
            for(int col =r; col >=1;col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

package com.vishal.pattern;

public class pattern10 {
    public static void main(String[] args) {
        print(6);
    }
    public static void  print(int n){
        //upper part
        //outer loop
        for(int r=1; r<=n;r++){
            //inner loops
            for(int space = 1 ; space <r ;space++){
                System.out.print(" ");
            }
            for(int col= r ;col <=n ;col++){
                System.out.print(col+" ");
            }

            System.out.println();
        }
        for(int r=n-1; r>=1;r--){
            //inner loops
            for(int space = 1 ; space <r ;space++){
                System.out.print(" ");
            }
            for(int col= r ;col <=n ;col++){
                System.out.print(col+" ");
            }

            System.out.println();
        }
    }
}

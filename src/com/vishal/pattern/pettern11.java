package com.vishal.pattern;

public class pettern11 {
    public static void main(String[] args) {
        print(6);
    }
    public static  void  print (int n) {


        // outer loop to handle rows
        for (int r= 1;r<=n ;r++){
            for (int s=1; s<n ;s++){
                System.out.print("_");
            }
            for(int col =1; col <= (2 * r-1 ) ; col ++){
                if(col ==1 || r ==n || col == (2* r-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print("_");
                }
            }
            System.out.println();
        }


    }
}

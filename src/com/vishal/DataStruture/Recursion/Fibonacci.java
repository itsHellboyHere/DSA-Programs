package com.vishal.DataStruture.Recursion;
//Fibonacci series with the help of recursion.
 class Main {
    public static void main(String[] args) {
            int ans=fibo(4);
        System.out.println("Fibonacci is => "+ans);
    }

    static int fibo(int n ){ //argument variable is passed in subrecursive calls.
        //base condition
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
        //first left side call will complete then the right one will be called.
        //their should be a return type in sub recursive calls if function
        //is returning something.
    }
}

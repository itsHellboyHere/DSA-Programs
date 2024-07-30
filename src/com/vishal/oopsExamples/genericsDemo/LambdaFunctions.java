package com.vishal.oopsExamples.genericsDemo;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<5;i++){
            arr.add(i+1);
        }
//        arr.forEach((item)->{
//            System.out.println(item*2);
//        });
//        Consumer<Integer> fun=(item)->
//            System.out.println(item*2);
//        arr.forEach(fun);
        Operation sum=(a,b)-> a+b;
        Operation product=(a,b)-> a*b;
        Operation divide=(a,b)-> a/b;
        Operation sub=(a,b)-> a-b;


        LambdaFunctions calculator=new LambdaFunctions();
        System.out.println(calculator.operate(4,5,sum));
        System.out.println(calculator.operate(4,5, product));
        System.out.println(calculator.operate(8,2, divide));
    }
 
    private int operate(int a,int b,Operation op){
        return op.operation(a,b);
    }


}
interface Operation{
    int operation(int a ,int b);
}

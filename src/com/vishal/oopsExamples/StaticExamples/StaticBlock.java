package com.vishal.oopsExamples.StaticExamples;

public class StaticBlock {

    static int a=5;
    static int b;
    int c;
    StaticBlock(){
        System.out.println("Hello im constructor");
    }
    //will only run once when the first object is created i.e when the class is loaded for the first time.
    static {
        System.out.println("Static Block");
        b=3*a;
        //c=4;
    }

    public static void main(String[] args) {
         StaticBlock obj=new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
        StaticBlock.b+=5;
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
        StaticBlock obj2=new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
    }

}

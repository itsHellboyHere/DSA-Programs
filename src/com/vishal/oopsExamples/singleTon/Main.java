package com.vishal.oopsExamples.singleTon;

public class Main {
    public static void main(String[] args) {
        SingleTonClass obj=SingleTonClass.getInstance();
        SingleTonClass obj2=SingleTonClass.getInstance();
        System.out.println(obj);
        System.out.println(obj2);
    }
}

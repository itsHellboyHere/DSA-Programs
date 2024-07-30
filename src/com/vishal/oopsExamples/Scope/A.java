package com.vishal.oopsExamples.Scope;

public class A {
    private int num;
    private String name;
    int[] arr;

    public int getNum() {
        return num;
    }
    public String getName(){
        return name;
    }

    public A(int num) {
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}

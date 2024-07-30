package com.vishal.oopsExamples.abstractionDemo;

public abstract class Parent {
    final int VALUE;
    public Parent(){
        this.VALUE=76;

        System.out.println("Parent class constructor");
    }
    static void show(){
        System.out.println("Hello Parent class!");
    }
    abstract  void career(String name);
    abstract  void partner(String name,int age);
}

package com.vishal.oopsExamples.abstractionDemo;

public class Son extends Parent{
    public Son() {
        super();
        System.out.println("Son class constructor is called");
    }

    @Override
    void career(String name) {
        System.out.println("i wanna be "+name);
    }

    @Override
    void partner(String name,int age) {
        System.out.println("my partner is "+ name+" her age is "+ age);
    }
    void details(){
        System.out.println("just to show details!");
    }
}

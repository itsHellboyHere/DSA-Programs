package com.vishal.oopsExamples.InheritanceExamples;

public class BoxWeight extends  Box{

    double weight;
    public  BoxWeight(){
        super();
        System.out.println("IM CALLED.");
        this.weight=-1;
    }
    public BoxWeight(double side){
        super(side);
        System.out.println("Hello side constructor");
    }
    public BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h);
        System.out.println("my constructor is called ");
        this.weight = weight;
    }
}

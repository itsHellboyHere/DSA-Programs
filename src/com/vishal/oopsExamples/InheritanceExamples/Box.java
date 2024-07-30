package com.vishal.oopsExamples.InheritanceExamples;

public class Box {
    private double l;
    double w;
    double h;

    public double getL() {
        return l;
    }

    public Box() {
        System.out.println("single constructor of box class is called!.");
        this.l = l;
        this.w= w;
        this.h= h;
    }
    public Box(double side){
        System.out.println("SIDE constructor is called!.");
        this.l=side;
        this.w=side;
        this.h=side;
    }
    public Box(double l,double w, double h){
        System.out.println("u called me!.");
        this.l = l;
        this.w= w;
        this.h= h;
    }
    Box (Box old){
        this.l=old.l;
        this.w=old.w;
        this.h=old.h;
    }

}

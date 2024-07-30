package com.vishal.oopsExamples.InterfaceExa;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric engine starts.");
    }

    @Override
    public void stop() {
        System.out.println("ElectricEngine stops.");
    }

    @Override
    public void acc() {
        System.out.println("ElectricEngine accelerate.");
    }
}

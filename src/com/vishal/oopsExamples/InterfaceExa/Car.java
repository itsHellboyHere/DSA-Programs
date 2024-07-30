package com.vishal.oopsExamples.InterfaceExa;

public class Car implements Engine,Brake,Media{
   
    @Override
    public void brake() {
        System.out.println("Brakes are enabled.");
    }

    @Override
    public void start() {
        System.out.println("I start engine like a normal car!.");
    }

    @Override
    public void stop() {
        System.out.println("i stop engine like a normal car!.");
    }

    @Override
    public void acc() {
        System.out.println("i accelerate like a normal car!.");
    }

}

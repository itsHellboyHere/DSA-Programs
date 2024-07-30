package com.vishal.oopsExamples.InterfaceExa;

public class CdPlayer implements Media{

    @Override
    public void start() {
        System.out.println("Pop music started.");
    }

    @Override
    public void stop() {
        System.out.println("Music Stopped.");
    }
}

package com.vishal.oopsExamples.InterfaceExa;

public class Main {
    public static void main(String[] args) {
//        Engine car=new Car();
//        car.acc();
//        car.start();
//        car.stop();
//
//        Media carMedia=new Car();
//        carMedia.start();
//        carMedia.stop();
            NiceCar car=new NiceCar();
            car.stopMusic();
            car.stop();
            car.start();
            car.upgradeEngine();
            car.start();
    }
}

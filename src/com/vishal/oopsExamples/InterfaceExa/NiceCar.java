package com.vishal.oopsExamples.InterfaceExa;

public class NiceCar {
    private Engine engine;
    private Media player=new CdPlayer();

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

//    public NiceCar(Media player) {
//        this.player = player;
//    }
    public NiceCar() {
        engine=new PowerEngine();
    }



    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void startMusic(){
        player.start();
    }
    public  void stopMusic(){
        player.stop();
    }
    public void upgradeEngine(){
        this.engine=new ElectricEngine();
    }
}

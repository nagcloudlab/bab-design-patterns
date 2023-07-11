package com.example.observer;

public class Fan implements DoorListener {
    public  void on(){
        System.out.println("Fan on");
    }
    public  void off(){
        System.out.println("Fan off");
    }
}

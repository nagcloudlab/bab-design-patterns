package com.example.observer;

public class Light implements DoorListener {
    public void on(){
        System.out.println("Light on");
    }
    public void off(){
        System.out.println("Light off");
    }
}

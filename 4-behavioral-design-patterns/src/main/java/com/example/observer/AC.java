package com.example.observer;

public class AC implements DoorListener {
    public void on(){
        System.out.println("AC on");
    }
    public void off(){
        System.out.println("AC off");
    }
}

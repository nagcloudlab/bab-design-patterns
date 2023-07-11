package com.example.observer;

import java.util.ArrayList;
import java.util.List;

public class Door {

    private final List<DoorListener> doorListeners=new ArrayList<>();

    public void addDoorListener(DoorListener doorListener) {
        doorListeners.add(doorListener);
    }
    public void removeDoorListener(DoorListener doorListener) {
        doorListeners.remove(doorListener);
    }

    public void open() {
        System.out.println("door opened");
        for (DoorListener doorListener : doorListeners) {
            doorListener.on(); // pull
//             stream.next({type: 'open', data: 'door opened'}) // push
        }
    }
    public void close() {
        System.out.println("door closed");
        for (DoorListener doorListener : doorListeners) {
            doorListener.off();
        }
    }
}


// Observer pattern + Async-commn with subscriber ==> Reactive/Async Programming
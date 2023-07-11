package com.example.observer;

import java.util.concurrent.TimeUnit;

public class Application {
    public static void main(String[] args) throws InterruptedException {

        Door door=new Door();

        Light light=new Light();
        door.addDoorListener(light);
        Fan fan=new Fan();
        door.addDoorListener(fan);

        door.removeDoorListener(fan);

        AC ac=new AC();
        door.addDoorListener(ac);

        TimeUnit.SECONDS.sleep(2);
        door.open();
        TimeUnit.SECONDS.sleep(2);
        door.close();

        //------------------------------------------

//        Employee employee = new Employee();
//        employee.doLearnAndWork();

        //---------------------------------------------
    }
}

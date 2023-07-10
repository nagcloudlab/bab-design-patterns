package com.example.singleton;

public class GlobalConfig {

    //...
    //...

    private static GlobalConfig instance;

    private GlobalConfig() {
        System.out.println("GlobalConfig -> constructor");
    }

    // double check lock
    public static GlobalConfig getInstance() {
        if (instance == null) {
            System.out.println(Thread.currentThread().getName() + " creating instance");
            synchronized (GlobalConfig.class) {
                if (instance == null) {
                    instance = new GlobalConfig();
                }
            }
        }
        return instance;
    }

}

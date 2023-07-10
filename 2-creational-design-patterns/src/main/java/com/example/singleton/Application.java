package com.example.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Calendar;

public class Application {

    static Logger logger = LoggerFactory.getLogger("bab");

    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.availableProcessors());
        System.out.println(runtime.totalMemory());
        System.out.println(runtime.freeMemory());

        logger.info("hello BAB");

        //-----------------------------------------------
        // thread-1
        //-----------------------------------------------

        Thread thread1 = new Thread(() -> {
            GlobalConfig meGlobalConfig = GlobalConfig.getInstance();
        }, "T1");
        thread1.start();


        //-----------------------------------------------
        // thread-2
        //-----------------------------------------------
        Thread thread2 = new Thread(() -> {
            GlobalConfig meGlobalConfig = GlobalConfig.getInstance();
        });
        thread2.start();

        //-----------------------------------------------
        // thread-3
        //-----------------------------------------------

        Thread thread3 = new Thread(() -> {
            GlobalConfig meGlobalConfig = GlobalConfig.getInstance();
        }, "T3");
        thread3.start();


        //-----------------------------------------------
        // thread-4
        //-----------------------------------------------
        Thread thread4 = new Thread(() -> {
            GlobalConfig meGlobalConfig = GlobalConfig.getInstance();
        }, "T4");
        thread4.start();


    }
}

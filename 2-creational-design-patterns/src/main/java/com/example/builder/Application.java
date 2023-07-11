package com.example.builder;

public class Application {
    public static void main(String[] args) {

        Car car = new CarBuilder()
                .setColor("red")
                .setBrand("Nissan")
                .setYear(2023)
                .setModel("Ford")
                .build();
        System.out.println(car);


    }
}

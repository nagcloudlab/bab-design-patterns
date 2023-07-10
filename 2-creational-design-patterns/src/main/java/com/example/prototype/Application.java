package com.example.prototype;

public class Application {
    public static void main(String[] args) throws CloneNotSupportedException {

        Circle circle11 = new Circle(new Color("red"));
        Circle circle12 = (Circle) circle11.clone();

        System.out.println(circle12.getColor().getName());



    }
}

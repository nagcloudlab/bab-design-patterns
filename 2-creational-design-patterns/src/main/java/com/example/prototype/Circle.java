package com.example.prototype;

public class Circle implements Shape, Cloneable {

    private Color color;

    /*
           object creation is 2-step process

           1. dynamic memory allocation  --> 'new' keyword
           2. initialize memory with obj's data --> 'constructor'

        */
    public Circle(Color color) {
        this.color = color;
        // ...
        // ...
        // ...
    }

    public Color getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.print("Drawing a circle in ");
        color.applyColor();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

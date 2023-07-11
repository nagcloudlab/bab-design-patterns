package com.example.flyweight;

import java.util.HashMap;
import java.util.Map;

// Flyweight interface
interface Shape {
    void draw();
}


// Concrete flyweight class - Circle
class Circle implements Shape {
    private String color;
    private int x;
    private int y;
    private int radius;

    static int count = 0;

    public Circle(String color) {
        count++;
        System.out.println("circle-count :" + count);
        this.color = color;
    }

    public void setCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " circle at (" + x + ", " + y + ") with radius " + radius);
    }
}

// Flyweight factory
class ShapeFactory {
    private static final Map<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Shape circle = circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
        }

        return circle;
    }
}


public class Application {

    private static final String[] COLORS = {"Red", "Blue", "Green", "Yellow", "Black"};


    private static String getRandomColor() {
        return COLORS[(int) (Math.random() * COLORS.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomRadius() {
        return (int) (Math.random() * 10) + 5;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setCoordinates(getRandomX(), getRandomY());
            circle.setRadius(getRandomRadius());
            circle.draw();
        }

    }

}

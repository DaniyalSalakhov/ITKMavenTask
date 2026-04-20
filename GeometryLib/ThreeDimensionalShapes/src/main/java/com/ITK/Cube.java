package com.ITK;

public class Cube {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double area(){
        return 6 * side * side;
    }

    //Для 1.1.0-SNAPSHOT
    public double volume(){
        return side * side * side;
    }
}

package com.ITK;

public class Sphere {
    private double radius;

    public Sphere(double radius){
        this.radius = radius;
    }

    public double area(){
        return 4* Math.PI * radius * radius;
    }

    public double volume(){
        return (double) 4 / 3 *  Math.PI * radius * radius * radius;
    }
}

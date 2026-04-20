package com.ITK;

public class GeometryConverter {
    public static double centimetersToMillimeters(double value){
        return value * 10;
    }

    public static double millimetersToCentimeters(double value){
        return value / 10;
    }

    //Для обновления до 1.1.0
    public static double centimetersToInches(double value){
        return value / 2.54;
    }

    public static double inchesToCentimeters(double value){
        return value * 2.54;
    }
}

package com.ITK;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Круг: " + circle.getPerimeter() + " " + circle.getArea());
        Triangle triangle = new Triangle(5, 5, 5);
        System.out.println("Треугольник: " + triangle.getPerimeter() + " " + triangle.getArea());
        Rectangle rectangle= new Rectangle(10, 5);
        System.out.println("Прямоугольник: " + rectangle.getPerimeter() + " " + rectangle.getArea());

        //Для GeometryUtils 1.0.0-SNAPSHOT
        double rectangleAreaInMm = GeometryConverter.centimetersToMillimeters(rectangle.getArea());
        System.out.println("Площадь треугольника в миллиметрах: " + rectangleAreaInMm);
        //Для GeometryUtils 1.1.0-SNAPSHOT
        double circleAreaInInches = GeometryConverter.centimetersToInches(circle.getArea());
        System.out.println("Площадь круга в дюймах: " + circleAreaInInches);

        //ThreeDimensionalShapes 1.0.0-SNAPSHOT
        Sphere sphere = new Sphere(5);
        System.out.println("Площадь сферы: " + sphere.area());

        //ThreeDimensionalShapes 1.1.0-SNAPSHOT
        System.out.println("Объем сферы: " + sphere.volume());
    }
}
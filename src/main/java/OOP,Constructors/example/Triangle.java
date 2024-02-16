package org.example;

public class Triangle extends org.example.Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }


    public static void main(String[] args) {
        // create some shapes
        org.example.Shape rectangle = new org.example.Rectangle(10, 12);
        org.example.Shape circle = new org.example.Circle(5);
        org.example.Shape triangle = new Triangle(7, 8, 6);

        // calculate area and perimeter of each shape
        System.out.println("\nArea and perimeter of various shapes:");
        System.out.println("\nRectangle: Length-10, Width-12");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        System.out.println("\nCircle: Radius-5");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        System.out.println("\nTriangle: Side1-7, Side2-8, Side3-6");
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
    }
}
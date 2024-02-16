package org.example;

public class Rectangle extends org.example.Shape {
    public double width;
    public double length;

    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }
    public double getArea(){
        return length*width;
    }
    public  double getPerimeter(){
        return 2 * (length + width);
    }

}


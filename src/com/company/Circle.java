package com.company;

public class Circle extends Shape{
    double radius = 1;
    Circle(double r, String c, boolean f){
        super(c, f);
        this.radius = r;
    }
    Circle(double r){
        this.radius =  r;
    }
    Circle(){}

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

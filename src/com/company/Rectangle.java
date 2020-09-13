package com.company;

public class Rectangle extends Shape{
    double width = 1;
    double length = 1;
    Rectangle(double w, double l, String c, boolean f){
        super(c, f);
        this.width = w;
        this.length = l;
    }
    Rectangle(double w, double l){
        this.width = w;
        this.length = l;
    }
    Rectangle(){}

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
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

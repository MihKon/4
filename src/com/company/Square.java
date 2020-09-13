package com.company;

public class Square extends Rectangle{
    Square(double side, String c, boolean f){
        super(side, side, c, f);
    }
    Square(double s){
        super(s, s);
    }
    Square(){}
    public double getSide(){
        return this.getLength();
    }
    public void setSide(double side){
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
        this.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        this.setLength(side);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

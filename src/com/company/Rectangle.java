package com.company;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double lenght) {
        if (width > 0)
            this.width = width;
        else
            this.width = 0;
        if (lenght > 0)
            this.length = lenght;
        else
            this.length = 0;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
    public double getArea(){
        return length * width;
    }
}

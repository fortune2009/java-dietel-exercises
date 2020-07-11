package com.fortunedavid;

import java.util.InputMismatchException;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this(0.0, 0.0);
    }

    public Rectangle(double length, double width) {
        if(length < 0.0 || length > 20.0){
            throw new InputMismatchException(
                    "Your length must be great than 0.0 and lesser than 20.0");
        }
        if(width < 0.0 || width > 20.0){
            throw new InputMismatchException(
                    "Your width must be great than 0.0 and lesser than 20.0");
        }
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public Rectangle setLength(double length) {
        if(length < 0.0 || length > 20.0){
            throw new IllegalArgumentException(
                    "Your length must be great than 0.0 and lesser than 20.0");
        }
        this.length = length;
        return this;
    }

    public double getWidth() {
        return width;
    }

    public Rectangle setWidth(double width) {
        if(width < 0.0 || width > 20.0){
            throw new InputMismatchException(
                    "Your width must be great than 0.0 and lesser than 20.0");
        }
        this.width = width;
        return this;
    }


    public double perimeter(double length, double width) {
        return (2.0*length) + (2.0*width);
    }

    public double area(double length, double width) {
        return length * width;
    }
}

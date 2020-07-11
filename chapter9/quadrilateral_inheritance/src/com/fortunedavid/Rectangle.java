package com.fortunedavid;

public class Rectangle extends Quadrilateral {
    private Point point;
    private double length;
    private double breadth;

    @Override
    public String area(){
        double areaCalc = this.length * this.breadth;
        return String.format("Area of Rectangle = " + areaCalc);
    }

    public Point getPoint() {
        return point;
    }

    public Rectangle setPoint(Point point) {
        this.point = point;
        return this;
    }

    public double getLength() {
        return length;
    }

    public Rectangle setLength(double length) {
        this.length = length;
        return this;
    }

    public double getBreadth() {
        return breadth;
    }

    public Rectangle setBreadth(double breadth) {
        this.breadth = breadth;
        return this;
    }
}

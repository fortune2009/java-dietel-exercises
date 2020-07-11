package com.fortunedavid;

public class Square extends Quadrilateral {
    private Point point;
    private double length;
    private double breadth;

    @Override
    public String area(){
        double areaCalc = this.length * this.breadth;
        return String.format("Area of Square = " + areaCalc);
    }

    public Point getPoint() {
        return point;
    }

    public Square setPoint(Point point) {
        this.point = point;
        return this;
    }

    public double getLength() {
        return length;
    }

    public Square setLength(double length) {
        this.length = length;
        return this;
    }

    public double getBreadth() {
        return breadth;
    }

    public Square setBreadth(double breadth) {
        this.breadth = breadth;
        return this;
    }
}

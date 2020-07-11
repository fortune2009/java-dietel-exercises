package com.fortunedavid;

public class Trapezoid extends Quadrilateral {
    private Point point;
    private double length;
    private double breadth;

    @Override
    public String area(){
        double areaCalc = this.length * this.breadth;
        return String.format("Area of Trapezoid = " + areaCalc);
    }

    public Point getPoint() {
        return point;
    }

    public Trapezoid setPoint(Point point) {
        this.point = point;
        return this;
    }

    public double getLength() {
        return length;
    }

    public Trapezoid setLength(double length) {
        this.length = length;
        return this;
    }

    public double getBreadth() {
        return breadth;
    }

    public Trapezoid setBreadth(double breadth) {
        this.breadth = breadth;
        return this;
    }
}

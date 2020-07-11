package com.fortunedavid;

public class Parallelogram extends Quadrilateral {
    private Point points;
    private double length;
    private double breadth;



    @Override
    public String area(){
        double areaCalc = this.length * this.breadth;
        return String.format("Area of parallelogram = " + areaCalc);
    }

    public Point getPoints() {
        return points;
    }

    public Parallelogram setPoints(Point points) {
        this.points = points;
        return this;
    }

    public double getLength() {
        return length;
    }

    public Parallelogram setLength(double length) {
        this.length = length;
        return this;
    }

    public double getBreadth() {
        return breadth;
    }

    public Parallelogram setBreadth(double breadth) {
        this.breadth = breadth;
        return this;
    }
}

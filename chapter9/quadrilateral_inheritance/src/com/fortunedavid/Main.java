package com.fortunedavid;

public class Main {

    public static void main(String[] args) {

        Parallelogram parallelogram = new Parallelogram();
        parallelogram.setBreadth(3.0);
        parallelogram.setLength(6.0);
        System.out.println(parallelogram.area());

        Rectangle rectangle = new Rectangle();
        rectangle.setLength(7.0);
        rectangle.setBreadth(9.0);
        System.out.println(rectangle.area());

        Square square = new Square();
        square.setBreadth(2.0);
        square.setLength(1.5);
        System.out.println(square.area());

        Trapezoid trapezoid = new Trapezoid();
        trapezoid.setLength(4.0);
        trapezoid.setBreadth(2.5);
        System.out.println(trapezoid.area());
    }
}

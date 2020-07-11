package com.fortunedavid;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        try{
            Rectangle rectangle2 = new Rectangle(5,8);
            System.out.println(rectangle2.perimeter(rectangle2.getLength(),rectangle2.getWidth()));
            System.out.println(rectangle2.area(rectangle2.getLength(),rectangle2.getWidth()));

            System.out.println("Enter length: ");
            double length = scanner.nextInt();
            System.out.println("Enter width: ");
            double width = scanner.nextInt();
            rectangle.setLength(length);
            rectangle.setWidth(width);
            System.out.println(rectangle.perimeter(length, width));
            System.out.println(rectangle.area(length, width));
        }
        catch (IllegalArgumentException ex){
            System.err.println(ex.getMessage());
        }



    }
}

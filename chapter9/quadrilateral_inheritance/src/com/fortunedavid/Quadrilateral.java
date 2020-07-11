package com.fortunedavid;

public class Quadrilateral {
    private int xCoordinate;
    private int yCoordinate;

    public Quadrilateral(){

    }
    public Quadrilateral(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public Quadrilateral setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
        return this;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public Quadrilateral setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
        return this;
    }

    public String area(){
        double areaCalc = xCoordinate * yCoordinate;
        return String.format("Area of Quadrilateral = "  + areaCalc);
    }


}

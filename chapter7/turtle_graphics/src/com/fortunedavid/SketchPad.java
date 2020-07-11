package com.fortunedavid;

public class SketchPad {
    private int[][] floor = new int[20][20];

    public int[][] getFloor() {
        return floor;
    }

    public SketchPad setFloor(int[][] floor) {
        this.floor = floor;
        return this;
    }
}

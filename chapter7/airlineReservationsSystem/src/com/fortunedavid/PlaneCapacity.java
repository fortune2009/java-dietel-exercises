package com.fortunedavid;

public class PlaneCapacity {
    private final int firstClass = 1;
    private final int economyClass = 2;
    private boolean[] seatingChart = new boolean[10];

    public int getFirstClass() {
        return firstClass;
    }

    public int getEconomyClass() {
        return economyClass;
    }

    public boolean[] getSeatingChart() {
        return seatingChart;
    }

    public void setSeatingChart(int index) {
//        Arrays.fill(this.seatingChart, index, lastIndex, seating);
        this.seatingChart[index] = true;
    }
}

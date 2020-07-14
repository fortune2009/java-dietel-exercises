package com.fortunedavid;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    AirlineReservationSystem assignedSeat = new AirlineReservationSystem();
    System.out.println("Please type 1 for First Class or 2 for Economy: ");
    int prompt = scanner.nextInt();
    assignedSeat.assignSeat(prompt);

        System.out.println(Arrays.toString(assignedSeat.getSeatCapacity()));
    }
}

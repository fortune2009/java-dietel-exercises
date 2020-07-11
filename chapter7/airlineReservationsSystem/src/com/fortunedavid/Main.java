package com.fortunedavid;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    AssignedSeat assignedSeat = new AssignedSeat();
    System.out.println("Please type 1 for First Class or 2 for Economy: ");
    int prompt = scanner.nextInt();
    while(prompt != -1) {
        assignedSeat.setPlaneCapacity(prompt);
        System.out.println();
        System.out.println("Book More by typing 1 for First Class or 2 for Economy: ");
        int prompt2 = scanner.nextInt();
        assignedSeat.setPlaneCapacity(prompt2);
        System.out.println();
        System.out.println("Enter -1 to exit or continue by typing 1 for First Class or 2 for Economy: ");
        prompt = scanner.nextInt();
        if(prompt == -1){
            System.out.println("Thank You For Trusting Our Service!!!");
        }
    }
        System.out.println(Arrays.toString(assignedSeat.getPlaneCapacity()));
    }
}

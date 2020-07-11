package com.fortunedavid;

import java.util.Scanner;

public class AssignedSeat {
    private PlaneCapacity planeCapacity = new PlaneCapacity();
    private Scanner scanner = new Scanner(System.in);

    public boolean[] getPlaneCapacity() {
        return planeCapacity.getSeatingChart();
    }

    public void setPlaneCapacity(int prompt) {
       if(prompt==planeCapacity.getFirstClass()){
           System.out.println("Checking for available first class seats... ");
           vacantFirstClassSeat();
           preferedFirstClassSeat();
       }
       else if (prompt==planeCapacity.getEconomyClass()){
           System.out.println("Checking for available economy seats...");
           vacantEconomySeat();
           preferedEconomySeat();
       }
       else {
           System.out.println("Wrong command Entered!, Please Refresh and Try Again");
       }
    }

    public void preferedFirstClassSeat() {
        System.out.println("Enter seat Number to book a First Class seat: ");
        int choice = scanner.nextInt();
        int indexChoice = choice - 1;
        if(!vacantFirstClassSeat()) {
            if (indexChoice < 5) {
                if (!planeCapacity.getSeatingChart()[indexChoice]) {
                    planeCapacity.setSeatingChart(indexChoice);
                    boardingPass(choice);
                } else {
                    System.out.printf("%n%s%n%s%n","Sorry this seat is not available!!","See available options");
                    int half = planeCapacity.getSeatingChart().length/2;
                    for (int i = 0; i <half; i++) {
                        if (!planeCapacity.getSeatingChart()[i]) {
                            System.out.printf("%s %d %s %n", "seat", i+1, "is empty");
                        }
                    }

                }
            } else {
                System.out.printf("%d is not reserved for first class! ", choice);
            }
        }
        else {
            System.out.println("First Class is Fully Booked. Please Try Economy!");
            if(!vacantEconomySeat()) {
                preferedEconomySeat();
            }
        }
    }

    private void boardingPass(int seat) {
        if(seat<=5) {
            System.out.printf("%n%s%n%s%d%n", "Boarding Pass!", "Your \"First Class\" seat is no. ", seat);
        }
        else {
            System.out.printf("%n%s%n%s%d%n", "Boarding Pass!", "Your \"Economy Class\" seat is no. ", seat);
        }
    }

    private void preferedEconomySeat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter seat Number to book an Economy seat: ");
        int choice = scanner.nextInt();
        int indexChoice = choice - 1;
        if(indexChoice>4) {
            planeCapacity.setSeatingChart(indexChoice);
            boardingPass(choice);
        }
        else {
            System.out.printf("%d is not reserved for Economy Class! ", choice);
        }
    }

    private boolean vacantEconomySeat() {
        int fromCenterSeat = planeCapacity.getSeatingChart().length / 2;
        boolean flag = false;

        for(int i=fromCenterSeat; i<planeCapacity.getSeatingChart().length;i++){
            if(!planeCapacity.getSeatingChart()[i]) {
                System.out.printf("%s %d %s %n", "seat", i+1, "is empty");
            }
            else{
                System.out.printf("%20s %d %s %n", "seat", i+1, "is taken");
                flag = true;
            }
        }
        return flag;
    }

    private boolean vacantFirstClassSeat() {
        int lastSeat = planeCapacity.getSeatingChart().length / 2;
        boolean flag = true;
        for(int i=0; i<lastSeat;i++){
            if(planeCapacity.getSeatingChart()[i]) {
                System.out.printf("%20s %d %s %n", "seat", i+1, "is taken");
            }
            else{
                System.out.printf("%s %d %s %n", "seat", i+1, "is empty");
                flag = false;
            }

        }
        return flag;
    }

}

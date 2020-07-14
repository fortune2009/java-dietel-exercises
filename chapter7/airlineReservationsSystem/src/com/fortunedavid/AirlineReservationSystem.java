package com.fortunedavid;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.*;

public class AirlineReservationSystem {

    private final boolean[] mSeatCapacity = new boolean[10];
    private int mTwo;
    private int mOne;
    private final Random scanner = new Random();

    public boolean[] getSeatCapacity() {
        return mSeatCapacity;
    }

    public void assignSeat(int assign) {
        for(int i=0; i<mSeatCapacity.length;i++) {
            if (assign == 1) {
                int pOne = mOne;
                mOne = assignSeatFirstClass();
                    if ((!mSeatCapacity[mOne]) && (mOne!=pOne)) {
                        mSeatCapacity[mOne] = true;
                        System.out.printf("%-8s %n%s %n%s%d%n", "Boarding Pass Details",
                                "Your First Class Seat is:", "(SEAT NO.)-> ",
                                mOne + BigInteger.ONE.intValue());
                        break;
                    } else {
                        System.out.printf("Seat %d has been booked!%n",
                                mOne + BigInteger.ONE.intValue());
//                        break;
                    }
            } else if (assign == 2) {
                int pTwo = mTwo;
                mTwo = assignSeatEconomyClass();
                if((!mSeatCapacity[mTwo]) && (mTwo!=pTwo)) {
                   mSeatCapacity[mTwo] = true;
                   System.out.printf("%8s %n%s %n%s%d%n", "Boarding Pass Details",
                           "Your Economy Class Seat is:", "(SEAT NO.)-> ",
                           mTwo + BigInteger.ONE.intValue());
                   break;
               }
               else {
                   System.out.printf("Seat %d has been booked!%n",
                           mTwo + BigInteger.ONE.intValue());
//                    break;
               }
            } else {
                System.out.println("Please Enter Either 1 or 2. Try again!");
            }
            System.out.println();
        }
        System.out.println();
        setMoreBooking();
        System.out.println();
    }

    public void setMoreBooking() {
        System.out.println("For more Bookings:" +
                "\nEnter 1 for First Class" +
                "\nEnter 2 for Economy" +
                "\nEnter 3 to Cancel Booking" +
                "\nEnter 4 to Submit\n");
        int input = 1 + scanner.nextInt(4);
        System.out.println(input);
            switch (input){
                case 1:
                case 2:
                    assignSeat(input);
                    break;
                case 3:
                    if(mSeatCapacity[mOne]) {
                        System.out.printf("Booking @ Seat %d Canceling...%n%n",
                                            mOne + BigInteger.ONE.intValue());
                        mSeatCapacity[mOne] = false;
                        System.out.println("Booking Canceled!\n");
                    }else if(mSeatCapacity[mTwo]){
                        System.out.printf("Booking @ Seat %d Canceling...%n%n",
                                mOne + BigInteger.ONE.intValue());
                        mSeatCapacity[mTwo]= false;
                        System.out.println("Booking Canceled!\n");
                        break;
                    }
                default:
                    System.out.println("Thanks for your patronage! :)");
                    break;
            }
    }

    private int assignSeatEconomyClass() {
        SecureRandom random = new SecureRandom();
        int lastFive = random.nextInt(5);
       lastFive += 5;
       return lastFive;
    }

    private int assignSeatFirstClass() {
        Random random = new Random();
        return random.nextInt(5);
    }

    public int getTwo() {
        return mTwo;
    }

    public int getOne() {
        return mOne;
    }


}

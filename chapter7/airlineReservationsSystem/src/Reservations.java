import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Reservations {
    private ArrayList<Boolean> seats = new ArrayList<Boolean>(10);
    private Scanner scanner = new Scanner(System.in);

    public ArrayList<Boolean> getSeats() {
        return seats;
    }

    public void displayType(int type){
        if(type==1){
            System.out.println("Choose a First Class seat by typing 1 - 5: ");
            int choice = scanner.nextInt();
           seatChoice(choice);
        }
        else if(type==2){
            System.out.println("Choose an Economy seat by typing 6 - 10: ");
            int choice = scanner.nextInt();
            seatChoice(choice);
        }
        else {
            System.out.println("Incorrect input! please try again");
        }

    }

    private void seatChoice(int type) {
//        for(int i=0; i<seats.size(); i++){
            if(type==1 | type==2 | type==3 | type==4 | type==5 ){
                System.out.println("Checking Available Seat...");
                if(seats.size()<5){
                    switch (type){
                        case 1:
//                            if(seats.get(0)) {
                                if (seats.isEmpty()) {
                                    System.out.println("This seat is available!");
                                    seats.add(0, true);
                                    System.out.println(seats.toString());
                                } else {
                                    System.out.println("This Seat has been Booked!");
                                    System.out.printf("Seat %s, is available", (seats.isEmpty() ? seats.iterator() : "None"));
                                }
//                            }
                            break;
                        case 2:
                            if (seats.isEmpty()) {
                                System.out.println("This seat is available!");
                                seats.add(1, true);
                                System.out.println(seats.toString());
                            } else {
                                System.out.println("This Seat has been Booked!");
                                System.out.printf("Seat %s, is available", (seats.isEmpty() ? seats.iterator() : "None"));
                            }
                            break;
                        case 3:
                            if (seats.isEmpty()) {
                                System.out.println("This seat is available!");
                                seats.add(2, true);
                                System.out.println(seats.toString());
                            } else {
                                System.out.println("This Seat has been Booked!");
                                System.out.printf("Seat %s, is available", (seats.isEmpty() ? seats.iterator() : "None"));
                            }
                            break;
                        case 4:
                            if (seats.isEmpty()) {
                                System.out.println("This seat is available!");
                                seats.add(3, true);
                                System.out.println(seats.toString());
                            } else {
                                System.out.println("This Seat has been Booked!");
                                System.out.printf("Seat %s, is available", (seats.isEmpty() ? seats.iterator() : "None"));
                            }
                            break;
                        case 5:
                            if (seats.isEmpty()) {
                                System.out.println("This seat is available!");
                                seats.add(4, true);
                                System.out.println(seats.toString());
                            } else {
                                System.out.println("This Seat has been Booked!");
                                System.out.printf("Seat %s, is available", (seats.isEmpty() ? seats.iterator() : "None"));
                            }
                            break;
                    }
                    System.out.println(seats.toString());
                }
            }
            else if(type==6 | type==7 | type==8 | type==9 | type==10){
                System.out.println("Checking Available Seat!");
                if(seats.size()>4){
                    switch (seats.size()){
                        case 6:
                            seats.add(5,true);
                            break;
                        case 7:
                            seats.add(6,true);
                            break;
                        case 8:
                            seats.add(7,true);
                            break;
                        case 9:
                            seats.add(8,true);
                            break;
                        case 10:
                            seats.add(9,true);
                            break;
                    }
                    System.out.println(seats.toString());
                }
            }

//        }
    }
}

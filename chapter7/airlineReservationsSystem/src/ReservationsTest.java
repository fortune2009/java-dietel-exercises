import java.util.Scanner;

class ReservationsTest {
    private static Reservations reservations= new Reservations();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter type 1 or 2: ");
        int type = scanner.nextInt();
        reservations.displayType(type);

//        System.out.println(reservations.getSeats());


    }
}
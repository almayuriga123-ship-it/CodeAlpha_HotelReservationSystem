import java.util.Scanner;

public class HotelReservationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Hotel hotel = new Hotel();

        int choice;

        do {

            System.out.println("\n========== HOTEL RESERVATION SYSTEM ==========");
            System.out.println("1. View Available Rooms");
            System.out.println("2. Book a Room");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. Make Payment");
            System.out.println("5. View Booking Details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    hotel.displayAvailableRooms();
                    break;

                case 2:
                    System.out.print("Enter Room Number: ");
                    int roomNo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Customer Name: ");
                    String name = sc.nextLine();

                    hotel.bookRoom(roomNo, name);
                    break;

                case 3:
                    System.out.print("Enter Room Number to Cancel: ");
                    roomNo = sc.nextInt();

                    hotel.cancelReservation(roomNo);
                    break;

                case 4:
                    System.out.print("Enter Room Number: ");
                    roomNo = sc.nextInt();

                    hotel.paymentSimulation(roomNo);
                    break;

                case 5:
                    hotel.viewReservations();
                    break;

                case 6:
                    System.out.println("Thank you for using Hotel Reservation System.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}

import java.util.ArrayList;

public class Hotel {

    ArrayList<Room> rooms = new ArrayList<>();
    ArrayList<Reservation> reservations = new ArrayList<>();

    public Hotel() {

        rooms.add(new Room(101, "Standard", 1500));
        rooms.add(new Room(102, "Standard", 1500));
        rooms.add(new Room(201, "Deluxe", 2500));
        rooms.add(new Room(202, "Deluxe", 2500));
        rooms.add(new Room(301, "Suite", 5000));
    }

    public void displayAvailableRooms() {

        System.out.println("\n===== Available Rooms =====");

        for (Room room : rooms) {
            if (!room.isBooked) {
                room.displayRoom();
            }
        }
    }

    public void bookRoom(int roomNumber, String customerName) {

        for (Room room : rooms) {

            if (room.roomNumber == roomNumber && !room.isBooked) {

                room.isBooked = true;

                Reservation reservation = new Reservation(customerName, room);

                reservations.add(reservation);

                System.out.println("\nRoom booked successfully!");

                reservation.displayReservation();

                return;
            }
        }

        System.out.println("\nRoom is not available.");
    }

    public void cancelReservation(int roomNumber) {

        for (Reservation reservation : reservations) {

            if (reservation.room.roomNumber == roomNumber) {

                reservation.room.isBooked = false;

                reservations.remove(reservation);

                System.out.println("\nReservation cancelled successfully.");

                return;
            }
        }

        System.out.println("\nReservation not found.");
    }

    public void paymentSimulation(int roomNumber) {

        for (Reservation reservation : reservations) {

            if (reservation.room.roomNumber == roomNumber) {

                System.out.println("\nPayment Successful!");
                System.out.println("Amount Paid : ₹" + reservation.room.price);

                return;
            }
        }

        System.out.println("\nReservation not found.");
    }

    public void viewReservations() {

        if (reservations.isEmpty()) {

            System.out.println("\nNo reservations available.");

            return;
        }

        System.out.println("\n===== Reservation List =====");

        for (Reservation reservation : reservations) {

            reservation.displayReservation();
        }
    }
}
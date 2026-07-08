public class Reservation {

    String customerName;
    Room room;

    public Reservation(String customerName, Room room) {
        this.customerName = customerName;
        this.room = room;
    }

    public void displayReservation() {
        System.out.println("\n===== Booking Details =====");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Room Number   : " + room.roomNumber);
        System.out.println("Room Type     : " + room.roomType);
        System.out.println("Room Price    : ₹" + room.price);
        System.out.println("===========================\n");
    }
}

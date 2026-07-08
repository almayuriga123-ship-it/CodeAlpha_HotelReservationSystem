public class Room {

    int roomNumber;
    String roomType;
    double price;
    boolean isBooked;

    public Room(int roomNumber, String roomType, double price) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.price = price;
        this.isBooked = false;
    }

    public void displayRoom() {
        System.out.println("--------------------------------");
        System.out.println("Room Number : " + roomNumber);
        System.out.println("Room Type   : " + roomType);
        System.out.println("Price       : " + price);
        System.out.println("Status      : " + (isBooked ? "Booked" : "Available"));
    }
}

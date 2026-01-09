import java.util.*;

public class Hotel {
    List<Room> rooms = new ArrayList<>();

    public Hotel() {
        rooms.add(new Room(101, "AC", 2000));
        rooms.add(new Room(102, "NON-AC", 1500));
        rooms.add(new Room(103, "DELUXE", 3000));
    }

    public void showRooms() {
        for (Room r : rooms) {
            System.out.println(r.roomNumber + " | " + r.type + " | ₹" + r.price + " | " +
                    (r.isBooked ? "Booked" : "Available"));
        }
    }

    public void bookRoom(int roomNo, String name) {
        for (Room r : rooms) {
            if (r.roomNumber == roomNo && !r.isBooked) {
                r.isBooked = true;
                System.out.println("Payment Successful!");
                System.out.println("Room Booked for " + name);
                FileManager.saveBooking(name + "," + roomNo);
                return;
            }
        }
        System.out.println("Room Not Available!");
    }

    public void cancelRoom(int roomNo) {
        for (Room r : rooms) {
            if (r.roomNumber == roomNo && r.isBooked) {
                r.isBooked = false;
                System.out.println("Booking Cancelled!");
                return;
            }
        }
        System.out.println("Invalid Room Number!");
    }
}


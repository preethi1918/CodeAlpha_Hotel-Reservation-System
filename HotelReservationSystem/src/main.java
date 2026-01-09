import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hotel hotel = new Hotel();

        while (true) {
            System.out.println("\n1. View Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Room");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    hotel.showRooms();
                    break;
                case 2:
                    System.out.print("Enter Name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.print("Enter Room Number: ");
                    int roomNo = sc.nextInt();
                    hotel.bookRoom(roomNo, name);
                    break;
                case 3:
                    System.out.print("Enter Room Number: ");
                    hotel.cancelRoom(sc.nextInt());
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}


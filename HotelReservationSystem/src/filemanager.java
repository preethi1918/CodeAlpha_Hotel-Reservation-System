import java.io.*;

public class FileManager {

    public static void saveBooking(String data) {
        try {
            FileWriter fw = new FileWriter("bookings.txt", true);
            fw.write(data + "\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("File Error!");
        }
    }
}


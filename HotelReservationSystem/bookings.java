public class Booking {
    private String customerName;
    private int roomNumber;
    private String roomType;
    private double amountPaid;

    public Booking(String customerName, int roomNumber, String roomType, double amountPaid) {
        this.customerName = customerName;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.amountPaid = amountPaid;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    @Override
    public String toString() {
        return customerName + "," + roomNumber + "," + roomType + "," + amountPaid;
    }
}


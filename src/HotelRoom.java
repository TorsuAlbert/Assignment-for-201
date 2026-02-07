public class HotelRoom {
    private final  int roomNumber;
    private String roomType;
    private double pricePerNight;
    private boolean isOccupied;
    private String guestName;


    public HotelRoom(int roomNumber, String roomType, double pricePerNight, boolean isOccupied, String guestName) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.isOccupied = isOccupied;
        this.guestName = guestName;
    }

    public void checkIn(String name){
        if (isOccupied){
            guestName = null;
            isOccupied = true;
        }
    }

    public void checkOut(){
        isOccupied = false;
        guestName = null;
    }

    public double updatePrice(double newPrice){
        if (isOccupied){
            pricePerNight = newPrice;
        }
        return pricePerNight;
    }

    static void main(String[] args) {
        HotelRoom HR1 = new HotelRoom(245,"Self Contained",150.50,true,"Albert");
        System.out.println(HR1.guestName);
        System.out.println(HR1.pricePerNight);
    }
}

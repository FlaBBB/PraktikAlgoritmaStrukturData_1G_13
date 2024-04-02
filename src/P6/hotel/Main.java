package P6.hotel;

public class Main {
    public static void main(String[] args) {
        HotelService hs = new HotelService();
        hs.tambahHotel(new Hotel("Hotel C", "Surabaya"  , 2000000, (byte) 3));
        hs.tambahHotel(new Hotel("Hotel D", "Bali"      , 1500000, (byte) 2));
        hs.tambahHotel(new Hotel("Hotel A", "Jakarta"   , 1000000, (byte) 5));
        hs.tambahHotel(new Hotel("Hotel B", "Bandung"   , 500000, (byte) 4));
        hs.tambahHotel(new Hotel("Hotel E", "Yogyakarta", 300000, (byte) 1));
        hs.tampilAll();

        System.out.println("==========================================");
        System.out.println("Setelah bubble sort");
        hs.bubbleSort();
        hs.tampilAll();

        System.out.println("==========================================");
        System.out.println("Setelah selection sort");
        hs.selectionSort();
        hs.tampilAll();
    }
}

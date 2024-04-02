package P6.hotel;

public class HotelService {
    Hotel rooms[];
    int idx;

    HotelService() {
        rooms = new Hotel[10];
    }

    void tambahHotel(Hotel h) {
        if (idx < rooms.length) {
            rooms[idx] = h;
            idx++;
            return;
        }
        System.out.println("Kamar penuh");
    }

    void tampilAll() {
        for (int i = 0; i < idx; i++) {
            System.out.println("Nama Hotel: " + rooms[i].nama);
            System.out.println("Kota: " + rooms[i].kota);
            System.out.println("Harga: " + rooms[i].harga);
            System.out.println("Bintang: " + rooms[i].bintang);
            System.out.println();
        }
    }

    void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (rooms[j].harga > rooms[j + 1].harga) {
                    Hotel temp = rooms[j];
                    rooms[j] = rooms[j + 1];
                    rooms[j + 1] = temp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < idx - 1; i++) {
            int min = i;
            for (int j = i + 1; j < idx; j++) {
                if (rooms[j].bintang > rooms[min].bintang) {
                    min = j;
                }
            }
            Hotel temp = rooms[min];
            rooms[min] = rooms[i];
            rooms[i] = temp;
        }
    }
}

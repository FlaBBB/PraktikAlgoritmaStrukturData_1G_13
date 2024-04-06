package P7;

public class Buku13 {
    int kodeBuku;
    String judul;
    int tahunTerbit;
    String pengarang;
    int stock;

    Buku13(int kodeBuku, String judul, int tahunTerbit, String pengarang, int stock) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stock = stock;
    }

    public void tampil() {
        System.out.println("Kode Buku: " + kodeBuku);
        System.out.println("Judul: " + judul);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Stock: " + stock);
    }
}

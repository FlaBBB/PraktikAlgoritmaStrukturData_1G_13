package P2;

/**
 * Buku13
 */
public class Buku13 {

    String judul, pengarang;
    int halaman, stok, harga;

    public Buku13() {

    }

    public Buku13(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual(int jml) {
        if (stok < jml) {
            System.out.println("Stok tidak cukup");
            return;
        }
        stok -= jml;
    }

    void restok(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    int hotungHargaTotal(int terjual) {
        return harga * terjual;
    }

    int hitungDiskon() {
        double harga = this.harga;
        if (this.harga > 150_000) {
            harga *= 0.12;
        } else if (this.harga >= 75_000 && this.harga <= 150_000) {
            harga *= 0.05;
        }
        return (int) harga;
    }

    int hitungHargaBayar(int beli) {
        return hotungHargaTotal(beli) - hitungDiskon();
    }
}
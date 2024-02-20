package P2;

public class BukuFikri {
    String judul, pengarang;
    int halaman, stok, harga;
    
    public BukuFikri(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
}
